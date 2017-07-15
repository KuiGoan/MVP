package com.ifi.kuirin.mvp.util;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.annotation.NonNull;

/**
 * Created by KuiRin on 7/15/2017 AD.
 */

public class CustomFragmentManager {
    private Activity mContext;

    public CustomFragmentManager(Activity context) {
        this.mContext = context;
    }

    public FragmentManager getFragmentManager() {
        return mContext.getFragmentManager();
    }

    public static CustomFragmentManager build(Activity context) {
        return new CustomFragmentManager(context);
    }

    public void addFragment(int layoutId, @NonNull Fragment fragment, @NonNull String tag) {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager
                .beginTransaction();
        fragmentTransaction.add(layoutId, fragment, tag);
//        fragmentTransaction.addToBackStack(tag);
        fragmentTransaction.commit();
    }

    public void replaceFragment(int layoutId, @NonNull Fragment fragment, @NonNull String tag) {
        FragmentManager fragmentManager = getFragmentManager();
//        fragmentManager.popBackStack();
        FragmentTransaction fragmentTransaction = fragmentManager
                .beginTransaction();
        fragmentTransaction.replace(layoutId, fragment, tag);
        fragmentTransaction.addToBackStack(tag);
        fragmentTransaction.commit();
    }

    public void popBackStack() {
        FragmentManager fragmentManager = getFragmentManager();
        fragmentManager.popBackStack();
    }
}
