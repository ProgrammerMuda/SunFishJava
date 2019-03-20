package autocomplete.so.id.sunfishjava.Activity;

import android.support.annotation.NonNull;
import android.util.Log;

import javax.inject.Inject;

import autocomplete.so.id.sunfishjava.ApiClient.EndPoint;
import autocomplete.so.id.sunfishjava.Model.ResponseGOPATH;
import autocomplete.so.id.sunfishjava.MvP.Presenter;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.schedulers.Schedulers;
import retrofit2.adapter.rxjava2.HttpException;

public class MainActivityPresenter implements Presenter<MainActivityView> {

    private MainActivityView view = null;
    private Disposable preLogin = Disposables.empty();
    private final EndPoint endPoint;
//    private final SharedPreferences pref;





    @Inject
    public MainActivityPresenter(EndPoint endPoint) {
        this.endPoint = endPoint;
    }




    @Override
    public void onAttach(MainActivityView view) {

        this.view = view;
        LoadData();


    }



//    public <T> void  save( String name, T data){
//        pref.edit().putString(name, data.toString()).apply();
//
//    }
//
//    public void clear(){
//        pref.edit().clear().apply();
//    }

    private void LoadData() {
//        preLogin.dispose();
        endPoint.LoginBRO(
                "GetAPIConfig",
                "{\"account\":\"885-dev\"}",
                "9C1C5414B09EE2C0A7925C3FCC7CD25DBF54ECEDBB90BBFDA5C84F1F4CC660B95B6B3AFF2DFB05CC577B12A2ECD8072099BFF8D0CC7A0CAB3B985735")
                .subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<ResponseGOPATH>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d){}

                    @Override
                    public void onNext(@NonNull  ResponseGOPATH responseData) {
                        Log.d("Log", responseData.toString());
                        view.onLoadSucces(responseData);

                    }

                    @Override
                    public void onError(@NonNull  Throwable e) {

                        if (e instanceof HttpException){
                            view.onLoadError("Data is null");
                        } else {
                            view.onLoadError(e.getLocalizedMessage());
                        }

//                        view.onLoadError(e.getLocalizedMessage());


                    }

                    @Override
                    public void onComplete() {

                    }
                });

    }

    @Override
    public void onDetach() {

    }
}
