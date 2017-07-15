package com.ifi.kuirin.mvp.util;

import android.util.Log;

import com.ifi.kuirin.mvp.BuildConfig;

/**
 * Created by KuiRin on 7/15/2017 AD.
 */

public class Logger {
    public static boolean DEBUG() {
        return BuildConfig.DEBUG;
    }

    public static void d(String tag, String msg) {
        if (DEBUG()) {
            Log.d(tag, msg);
        }
    }

    public static void e(String tag, String msg) {
        if (DEBUG()) {
            Log.d(tag, msg);
        }
    }
}
