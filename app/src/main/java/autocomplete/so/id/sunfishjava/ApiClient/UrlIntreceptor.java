package autocomplete.so.id.sunfishjava.ApiClient;

import android.support.annotation.NonNull;
import android.util.Log;

import java.io.IOException;

import autocomplete.so.id.sunfishjava.SharedHelper.SharedHelper;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

public class UrlIntreceptor implements Interceptor {

   private  final SharedHelper pref;

    public UrlIntreceptor(SharedHelper pref) {
        this.pref = pref;
    }


    @NonNull
    @Override
    public Response intercept(@NonNull Chain chain) throws IOException {



            Request original = chain.request();
            Log.d("Log", "Mask Intereceptor");
            Log.d("Log", pref.get("GOPath"));

            if (pref.get("GOPath") != null){
                original = original.newBuilder()
                        .url(pref.get("GOPath"))
                        .addHeader("Content-Type", "application/json")
                        .addHeader("Accept", "application/json")
                        .build();
            }

        Log.d("Log", "Keluar Intereceptor");
        return chain.proceed(original);
//
//        return  chain.proceed(login);




    }
}
