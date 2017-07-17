package com.ifi.kuirin.mvp.base.dialog;

/**
 * Created by ddquy on 7/17/2017.
 */

class AleartDialog {
    private static final AleartDialog ourInstance = new AleartDialog();

    static AleartDialog getInstance() {
        return ourInstance;
    }

    private AleartDialog() {
    }
}
