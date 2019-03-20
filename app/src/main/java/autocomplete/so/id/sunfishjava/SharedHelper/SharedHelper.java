package autocomplete.so.id.sunfishjava.SharedHelper;

import android.content.SharedPreferences;

public class SharedHelper  {

    private final SharedPreferences sharedPreferences;

    public SharedHelper(SharedPreferences sharedPreferences) {
        this.sharedPreferences = sharedPreferences;
    }

    public String get(String name){
        return  sharedPreferences.getString(name, null);

    }


    public <T> void  save( String name, T data){
        sharedPreferences.edit().putString(name, data.toString()).apply();

    }

    public void clear(){
        sharedPreferences.edit().clear().apply();
    }
}
