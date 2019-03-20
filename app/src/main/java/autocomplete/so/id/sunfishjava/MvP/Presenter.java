package autocomplete.so.id.sunfishjava.MvP;

public interface Presenter<T extends View> {

    void onAttach(T view);
    void onDetach();


}
