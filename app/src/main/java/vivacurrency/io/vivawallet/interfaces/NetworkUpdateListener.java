package vivacurrency.io.vivawallet.interfaces;


import okhttp3.Response;

public interface NetworkUpdateListener {

    void onUpdate(Response s);
}
