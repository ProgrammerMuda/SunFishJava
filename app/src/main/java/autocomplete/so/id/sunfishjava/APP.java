package autocomplete.so.id.sunfishjava;

import android.app.Application;

import autocomplete.so.id.sunfishjava.Dagger.component.AppComponent;
import autocomplete.so.id.sunfishjava.Dagger.component.DaggerAppComponent;
import autocomplete.so.id.sunfishjava.Dagger.module.AppModule;
import autocomplete.so.id.sunfishjava.Dagger.module.NetworkModule;

public class APP extends Application {

    public static AppComponent appComponent;


    @Override
    public void onCreate() {
        super.onCreate();

        appComponent  = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .networkModule(new NetworkModule("https://saas.dataon.com"))
                .build();

    }
}
