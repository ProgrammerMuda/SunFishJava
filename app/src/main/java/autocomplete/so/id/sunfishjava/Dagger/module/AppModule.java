package autocomplete.so.id.sunfishjava.Dagger.module;

import android.app.Application;
import android.content.Context;
import android.preference.PreferenceManager;

import javax.inject.Singleton;

import autocomplete.so.id.sunfishjava.APP;
import autocomplete.so.id.sunfishjava.SharedHelper.SharedHelper;
import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    private APP app;

    public AppModule(APP app) {
        this.app = app;
    }

    @Provides
    @Singleton
    Application application() {
        return app;
    }

    @Provides
    @Singleton
    Context context() {
        return app.getApplicationContext();
    }

    @Provides
    @Singleton
    SharedHelper sharedHelper(Application app) {
        return (SharedHelper) PreferenceManager.getDefaultSharedPreferences(app);
    }


}
