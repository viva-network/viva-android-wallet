package vivacurrency.io.vivawallet.interfaces;

/**
 * Created by Manuel on 06.01.2018.
 */

public interface PasswordDialogCallback {

    void success(String password);

    void canceled();
}
