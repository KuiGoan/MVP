package com.ifi.kuirrin.mvp.home;

import com.ifi.kuirrin.mvp.base.BasePresenter;

import java.util.Random;

/**
 * Created by ddquy on 7/14/2017.
 */

public class MainPresenter extends BasePresenter<IMainContract.View> implements IMainContract.Presenter{

    private String[] helloTexts = {"BONJOUR", "HOLA", "HALLO", "MERHABA", "HELLO", "CIAO", "KONNICHIWA"};

    private static MainPresenter sInstanse = new MainPresenter();

    public static MainPresenter getInstance() {
        return sInstanse;
    }

    @Override
    public void loadHelloText() {
        Random random = new Random();
        String hello = helloTexts[random.nextInt(helloTexts.length)];
        getView().onTextLoaded(hello);
    }

    @Override
    public void setClickHere() {
        getView().onClicked();
    }
}
