package autocomplete.so.id.sunfishjava.Dagger.component;

import javax.inject.Singleton;

import autocomplete.so.id.sunfishjava.Activity.MainActivity;
import autocomplete.so.id.sunfishjava.Dagger.module.AppModule;
import autocomplete.so.id.sunfishjava.Dagger.module.NetworkModule;
import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, NetworkModule.class})
public interface AppComponent {

    void injectMain(MainActivity mainActivity);
}
