public class EsitAgirlik extends Aday {

    public EsitAgirlik(int turkce, int matematik, int edebiyat, int fizik, String isim) {  //  String isim ekledik.  //  7
        super(turkce, matematik, edebiyat, fizik, isim);  //  Parantez sonuna isim ekledik.  //  8
    }

    @Override
    public int puanHesapla() {

        return getTurkce() * 5 + getMatematik() * 5 + getFizik() * 1 + getEdebiyat() * 4;
    }


}
