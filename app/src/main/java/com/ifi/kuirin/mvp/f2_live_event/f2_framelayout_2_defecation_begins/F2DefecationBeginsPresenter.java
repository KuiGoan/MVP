package com.ifi.kuirin.mvp.f2_live_event.f2_framelayout_2_defecation_begins;

import com.ifi.kuirin.mvp.base.BasePresenter;

/**
 * Created by KuiRin on 7/15/2017 AD.
 */

public class F2DefecationBeginsPresenter extends BasePresenter<IF2DefecationBeginsContract.View>
        implements IF2DefecationBeginsContract.Presenter {

    private static F2DefecationBeginsPresenter sInstanse = new F2DefecationBeginsPresenter();

    public static F2DefecationBeginsPresenter getInstance() {
        return sInstanse;
    }

    @Override
    public void clickItem(int position) {
        getView().onClickItem(position);
    }


//    @Override
//    public void loadData() {
//        getView().onLoadData();
//    }
//
//    @Override
//    public void itemPresedenceSelect(int position) {
//        getView().onItemPresedenceSelected(position);
//    }
}
