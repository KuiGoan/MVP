package com.ifi.kuirrin.mvp.base;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;


import butterknife.ButterKnife;

/**
 * Created by ddquy on 7/14/2017.
 */

public abstract class BaseActivity<T extends IBasePresenter> extends AppCompatActivity implements IBaseView {

    /**
     * Injected presenter
     */
//    @Inject
//    T mPresenter;

//    private IActivityComponent mIActivityComponent;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentResource());
        ButterKnife.bind(this);
//        mIActivityComponent = Da
        init(savedInstanceState);
    }

    /**
     * Getter for the presenter
     *
     * @return the present for the activity
     */
//    public T getPresenter() {
//        return mPresenter;
//    }


    /**
     * Layout resource to be inflated
     *
     * @return layout resource
     */
    @LayoutRes
    protected abstract int getContentResource();

    /**
     * Initialisations
     */
    protected abstract void init(@Nullable Bundle state);

    /**
     * Injecting dependencies
     */
//    protected abstract void injectDependencies();

}
