package com.ifi.kuirin.mvp.base.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.NonNull;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

import com.ifi.kuirin.mvp.R;

/**
 * Created by KuiRin on 7/15/2017 AD.
 */

@SuppressLint("AppCompatCustomView")
public class RectangleView extends View {

    int mSmallIcon;

    int mSmallIconPosition;

    public RectangleView(@NonNull Context context) {
        this(context, null);
    }

    public RectangleView(@NonNull Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        if (context == null) {
            return;
        }

        TypedArray a = context.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.RectangleView,
                0, 0);
        try {
            mSmallIcon = a.getResourceId(R.styleable.RectangleView_smallIcon, -1);
            mSmallIconPosition = a.getInteger(R.styleable.RectangleView_smallIconPosition, -1);
        } finally {
            a.recycle();
        }
        initialize();
    }

    private void initialize() {
        ViewGroup viewGroup = (ViewGroup) inflate(getContext(), R.layout.rectangle_view, null);

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

    public RectangleView build(Context context) {
        return new RectangleView(context);
    }
}
