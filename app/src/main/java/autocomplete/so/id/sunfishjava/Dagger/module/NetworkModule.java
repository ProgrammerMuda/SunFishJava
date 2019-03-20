package autocomplete.so.id.sunfishjava.Dagger.module;

import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;

import autocomplete.so.id.sunfishjava.ApiClient.EndPoint;
import autocomplete.so.id.sunfishjava.ApiClient.UrlIntreceptor;
import autocomplete.so.id.sunfishjava.SharedHelper.SharedHelper;
import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class NetworkModule {

    private final String url;


    public NetworkModule(String url) {
        this.url = url;
    }

//    @Provides
//    @Singleton
//    Cache cache(Application app) {
//        int cacheSize = 10 * 1024 * 1024; // 10 MB
//        return new Cache(app.getCacheDir(), cacheSize);
//    }
//
//    @Provides
//    @Singleton
//    HttpLoggingInterceptor loggingInterceptor(){
//        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
//        if (BuildConfig.DEBUG){
//            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
//
//        }else {
//            interceptor.setLevel(HttpLoggingInterceptor.Level.NONE);
//        }
//
//        return interceptor;
//    }

    @Provides
    @Singleton
    OkHttpClient httpClient(SharedHelper pref){
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.addInterceptor(new UrlIntreceptor(pref));
//        builder.addInterceptor(logger);
//        builder.cache(cache);
        builder.connectTimeout(10, TimeUnit.SECONDS);
        builder.writeTimeout(10, TimeUnit.SECONDS);
        builder.readTimeout(30, TimeUnit.SECONDS);
        return builder.build();

    }

    @Provides
    @Singleton
    Retrofit retrofit(OkHttpClient client){
        return  new Retrofit.Builder()
                .baseUrl(url)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }


    @Provides
    @Singleton
    EndPoint endpoint (Retrofit retrofit){
        return retrofit.create(EndPoint.class);
    }
//    @Provides
//    @Singleton
//    Cache cache(Application app) {
//        int cacheSize = 10 * 1024 * 1024; // 10 MB
//        return new Cache(app.getCacheDir(), cacheSize);
//    }
//
//    @Provides
//    @Singleton
//    HttpLoggingInterceptor loggingInterceptor() {
//        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
//        if (BuildConfig.DEBUG) {
//            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
//        } else {
//            interceptor.setLevel(HttpLoggingInterceptor.Level.NONE);
//        }
//        return interceptor;
//    }
//
//    @Provides
//    @Singleton
//    OkHttpClient httpClient(HttpLoggingInterceptor logger ,Cache cache, SharedPreferences pref) {
//        OkHttpClient.Builder builder = new OkHttpClient().newBuilder();
//        builder.addInterceptor(new UrlIntreceptor(pref));
//        builder.addInterceptor(logger);
//        builder.cache(cache);
//        builder.connectTimeout(10, TimeUnit.SECONDS);
//        builder.writeTimeout(10, TimeUnit.SECONDS);
//        builder.readTimeout(30, TimeUnit.SECONDS);
//        return builder.build();
//    }
//
//    @Provides
//    @Singleton
//    Retrofit retrofit(OkHttpClient client) {
//        return new Retrofit.Builder()
//                .client(client)
//                .baseUrl(url)
//                .addConverterFactory(GsonConverterFactory.create())
//                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
//                .build();
//    }


}
