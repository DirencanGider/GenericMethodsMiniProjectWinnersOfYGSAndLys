public abstract class Aday {

    private int turkce;
    private int matematik;
    private int edebiyat;
    private int fizik;
    private String isim;  //  1

    public Aday(int turkce, int matematik, int edebiyat, int fizik, String isim) {  //  String isim ekledik.  //  2
        this.turkce = turkce;
        this.matematik = matematik;
        this.edebiyat = edebiyat;
        this.fizik = fizik;
        this.isim = isim;  //  3
    }

    public int getTurkce() {
        return turkce;
    }

    public void setTurkce(int turkce) {
        this.turkce = turkce;
    }

    public int getMatematik() {
        return matematik;
    }

    public void setMatematik(int matematik) {
        this.matematik = matematik;
    }

    public int getEdebiyat() {
        return edebiyat;
    }

    public void setEdebiyat(int edebiyat) {
        this.edebiyat = edebiyat;
    }

    public int getFizik() {
        return fizik;
    }

    public void setFizik(int fizik) {
        this.fizik = fizik;
    }

    public String getIsim() {  //  Getter ve Seer ekledik.  //  4
        return isim;
    }

    public void setIsim(String isim) {  //  Getter ve Seer ekledik.  //  4
        this.isim = isim;
    }

    abstract int puanHesapla ();

}
