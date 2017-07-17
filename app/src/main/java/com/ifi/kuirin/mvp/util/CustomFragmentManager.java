package com.ifi.kuirin.mvp.util;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.ifi.kuirin.mvp.base.dialog.AlertDialogFragment;

/**
 * Created by KuiRin on 7/15/2017 AD.
 */

public class CustomFragmentManager {
    private AppCompatActivity mContext;

    public CustomFragmentManager(AppCompatActivity context) {
        this.mContext = context;
    }

    public FragmentManager getFragmentManager() {
        return mContext.getSupportFragmentManager();
    }

    public static CustomFragmentManager build(AppCompatActivity context) {
        return new CustomFragmentManager(context);
    }

    public void addFragment(int layoutId, @NonNull Fragment fragment, @NonNull String tag) {
        FragmentManager fragmentManager = getFragmentManager();
        Fragment fragmentCheck = fragmentManager.findFragmentByTag(tag);
        if (fragmentCheck != null) {
            return;
        }
        FragmentTransaction fragmentTransaction = fragmentManager
                .beginTransaction();
        fragmentTransaction.add(layoutId, fragment, tag);
//        fragmentTransaction.addToBackStack(tag);
        fragmentTransaction.commitAllowingStateLoss();
    }

    public void replaceFragment(int layoutId, @NonNull Fragment fragment, @NonNull String tag) {
        FragmentManager fragmentManager = getFragmentManager();
//        fragmentManager.popBackStack();
        FragmentTransaction fragmentTransaction = fragmentManager
                .beginTransaction();
        fragmentTransaction.replace(layoutId, fragment, tag);
        fragmentTransaction.addToBackStack(tag);
        fragmentTransaction.commitAllowingStateLoss();
    }

    public void replaceFragmentNonAddStack(int layoutId, @NonNull Fragment fragment, @NonNull String tag) {
        FragmentManager fragmentManager = getFragmentManager();
//        fragmentManager.popBackStack();
        FragmentTransaction fragmentTransaction = fragmentManager
                .beginTransaction();
        fragmentTransaction.replace(layoutId, fragment, tag);
        fragmentTransaction.commitAllowingStateLoss();
    }

    public void popBackStack() {
        FragmentManager fragmentManager = getFragmentManager();
        fragmentManager.popBackStack();
    }

    public void addAlertDialogFragment(AlertDialogFragment alertDialogFragment) {
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        FragmentManager fm = getFragmentManager();
        Fragment prev = getFragmentManager().findFragmentByTag(AlertDialogFragment.TAG);
        if (prev != null) {
            ft.remove(prev);
        }
        alertDialogFragment.show(fm, AlertDialogFragment.TAG);
    }
}
