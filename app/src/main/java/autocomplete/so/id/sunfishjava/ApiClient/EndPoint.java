package autocomplete.so.id.sunfishjava.ApiClient;

import autocomplete.so.id.sunfishjava.Model.ResponseGOPATH;
import retrofit2.http.GET;
import io.reactivex.Observable;
import retrofit2.http.Query;

public interface EndPoint {

    @GET("/sf6svc/SFCSunFish.cfm")
    Observable<ResponseGOPATH> LoginBRO (@Query("parameter") String parameter,
                                                      @Query("PROVIDER") String PROVIDER,
                                                      @Query("STRAUTHKEY") String STRAUTHKEY);
}
