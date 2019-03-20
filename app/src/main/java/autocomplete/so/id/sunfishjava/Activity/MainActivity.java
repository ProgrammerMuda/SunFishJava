package autocomplete.so.id.sunfishjava.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import javax.inject.Inject;

import autocomplete.so.id.sunfishjava.APP;
import autocomplete.so.id.sunfishjava.Model.ResponseGOPATH;
import autocomplete.so.id.sunfishjava.R;
import autocomplete.so.id.sunfishjava.SharedHelper.SharedHelper;

public class MainActivity extends AppCompatActivity implements MainActivityView {
    @Inject
    SharedHelper preferences;

    @Inject
    MainActivityPresenter presenter;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        APP.appComponent.injectMain(this);

        textView = findViewById(R.id.java);

    }

    @Override
    public void onLoadSucces(ResponseGOPATH data) {

        Log.d("Log", "Harusnya kepanggil");
        Log.d("Log", data.getDATA().getGOPATH());
        textView.setText(data.getDATA().getGOPATH());
        preferences.save("GOPath", data.getDATA().getGOPATH());



    }

    @Override
    public void onLoadError(String data) {

    }

    @Override
    public void onDetach() {

    }

    @Override
    public void onAttach() {

        preferences.clear();
        presenter.onAttach(this);

    }
}
