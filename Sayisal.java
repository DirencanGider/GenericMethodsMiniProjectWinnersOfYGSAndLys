public class Sayisal extends Aday {


    public Sayisal(int turkce, int matematik, int edebiyat, int fizik, String isim) {  //  String isim ekledik.  //  5
        super(turkce, matematik, edebiyat, fizik, isim);  //  Parantez sonuna isim ekledik.  //  6
    }

    @Override
    public int puanHesapla() {

        return getTurkce() * 5 + getMatematik() * 5 + getFizik() * 4 + getEdebiyat() * 1;

    }


}
