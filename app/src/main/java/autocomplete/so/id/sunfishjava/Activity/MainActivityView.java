package autocomplete.so.id.sunfishjava.Activity;

import autocomplete.so.id.sunfishjava.Model.ResponseGOPATH;
import autocomplete.so.id.sunfishjava.MvP.View;

public interface MainActivityView  extends View {

    void onLoadSucces(ResponseGOPATH data);
    void onLoadError(String data);
}
