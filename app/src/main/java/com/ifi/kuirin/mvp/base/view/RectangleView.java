package com.ifi.kuirin.mvp.base.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.ifi.kuirin.mvp.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by KuiRin on 7/15/2017 AD.
 */

@SuppressLint("AppCompatCustomView")
public class RectangleView extends RelativeLayout {

    int mSmallIcon;
    int mSmallIconPosition;
    String mText;
    int mTextColor;
    int mOrientation;

    @BindView(R.id.rectangle_view_small_icon)
    ImageView mRectangleViewSmallIcon;
    @BindView(R.id.rectangle_view_text)
    TextView mRectangleViewText;
    @BindView(R.id.rectangle_view)
    RelativeLayout mRectangleView;


    public RectangleView(@NonNull Context context) {
        this(context, null);
    }

    public RectangleView(@NonNull Context context, AttributeSet attrs) {
        super(context, attrs);
        if (!isInEditMode()) {
            init(context, attrs);
        }
    }

    private void init(Context context, AttributeSet attrs) {
        if (context == null) {
            return;
        }
//        setFocusable(true);
//        setFocusableInTouchMode(true);
        TypedArray a = context.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.RectangleView,
                0, 0);
        try {
            mSmallIcon = a.getResourceId(R.styleable.RectangleView_smallIcon, -1);
            mSmallIconPosition = a.getInteger(R.styleable.RectangleView_smallIconPosition, -1);
            mText = a.getString(R.styleable.RectangleView_text);
            mTextColor = a.getColor(R.styleable.RectangleView_textColor, Color.BLACK);
            mOrientation = a.getInteger(R.styleable.RectangleView_orientation, -1);
            initialize(context);
        } finally {
            a.recycle();
        }
    }

    private void initialize(Context context) {
        int layout;
        switch (mOrientation) {
            case 0:
                layout = R.layout.base_rectangle_view_vertical;
                break;
            case 1:
                layout = R.layout.base_rectangle_view_horizontal;
                break;
            default:
                layout = R.layout.base_rectangle_view;
                break;
        }

        ViewGroup viewGroup = (ViewGroup) inflate(context, layout, this);
        ButterKnife.bind(this, viewGroup);

        if (mSmallIcon != -1) {
            mRectangleViewSmallIcon.setVisibility(View.VISIBLE);
            mRectangleViewSmallIcon.setBackgroundResource(mSmallIcon);
        } else {
            mRectangleViewSmallIcon.setVisibility(View.GONE);
        }

        if (mSmallIconPosition != -1) {
            RelativeLayout.LayoutParams params
                    = (RelativeLayout.LayoutParams) mRectangleViewSmallIcon.getLayoutParams();
            if (getSmallIconPosition() == 0) {
                params.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
            } else {
                params.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
            }
            mRectangleViewSmallIcon.setLayoutParams(params);
        }

        if (mText != null) {
            mRectangleViewText.setText(mText);
            mRectangleViewText.setTextColor(mTextColor);
        }
    }

    public int getSmallIcon() {
        return mSmallIcon;
    }

    public RectangleView setSmallIcon(int smallIcon) {
        this.mSmallIcon = smallIcon;
        return this;
    }

    public int getSmallIconPosition() {
        return mSmallIconPosition;
    }

    public RectangleView setSmallIconPosition(int smallIconPosition) {
        this.mSmallIconPosition = smallIconPosition;
        return this;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        this.mText = text;
    }

    public RectangleView build(Context context) {
        return new RectangleView(context);
    }
}
