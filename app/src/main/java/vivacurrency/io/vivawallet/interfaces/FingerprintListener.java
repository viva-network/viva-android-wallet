package vivacurrency.io.vivawallet.interfaces;

import android.hardware.fingerprint.FingerprintManager;

public interface FingerprintListener {
    void authenticationFailed(String error);

    void authenticationSucceeded(FingerprintManager.AuthenticationResult result);
}