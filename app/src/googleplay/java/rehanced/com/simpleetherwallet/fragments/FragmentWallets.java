package vivacurrency.io.vivawallet.fragments;

import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import vivacurrency.io.vivawallet.R;
import vivacurrency.io.vivawallet.activities.AnalyticsApplication;
import vivacurrency.io.vivawallet.utils.Settings;

public class FragmentWallets extends FragmentWalletsAbstract{

    @Override
    public void adHandling(View rootView) {
        // Ads
        if (((AnalyticsApplication) ac.getApplication()).isGooglePlayBuild()) {
            AdView mAdView = (AdView) rootView.findViewById(R.id.adView);
            if (Settings.displayAds) {
                MobileAds.initialize(ac, "ca-app-pub-8285849835347571~6235180375");
                AdRequest adRequest = new AdRequest.Builder().build();
                mAdView.loadAd(adRequest);
            } else {
                mAdView.setVisibility(View.GONE);
            }
        }
    }
}