package vivacurrency.io.vivawallet.interfaces;


public interface StorableWallet {

    String getPubKey();

    long getDateAdded();

    void setPubKey(String pubKey);

    void setDateAdded(long dateAdded);
}
