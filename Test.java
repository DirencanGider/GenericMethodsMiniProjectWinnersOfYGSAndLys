
/*

Bu projenin Class'ları olduğu gibi bir önceki ders olan GenericMethodsdan alındı. Kopyaladğımız dersteki tüm yorum satırları
silindi.
İlk düzenleme Aday classında yapıldı. isim özelliği eklendi. Sonrasında constructor içerisine eklendi. Getter Setter metodları
da eklendi. Sayisal ve EsitAgirlik classlarına da ayn ekleme işlemleri yapıldı. Sonrasında burada Test.javaya gelinerek main metodu
içerisinde yer alan bir önceki dersten kalan herşey temizlendi.
Main metodu dışında kalan metodlardan da sadece generic metod bırakıldı. Onun da içeriği temizlenerek yeniden yazıldı.

 */


import java.sql.SQLOutput;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        System.out.println("YGS LYS Birincisi Bulma Programı");  //  14
        Scanner scanner = new Scanner(System.in);  //  15

        String islemler = "İşlemler...\n"  //  16
                            +"1. Eşit Ağırlık Öğrencileri Birincisi\n"
                            +"2. Sayısal Öğrencileri Birincisi";

        System.out.println("***************************************************");  //  17
        System.out.println(islemler);
        System.out.println("***************************************************");

        while(true) {  //  18

            System.out.println("Çıkış için q'ya basınız...");  //  19
            System.out.print("Devam etmek için ise herhangi bir harfe basınız...");
            String cevap = scanner.nextLine();
            if (cevap.equals("q")) {
                System.out.println("Programdan çıkılıyor...");
                break;
            }

            System.out.println("Öğrencilerin İsimlerini Giriniz...");

            //Birinci Öğrenci  //  25
            System.out.println("Birinci Öğrencinin İsmi : ");
            String isim1 = scanner.nextLine();

            System.out.print("Birinci Öğrencinin Netlerini Giriniz (Sırasıyla Türkçe Matematik Edebiyat Fizik şeklinde) : ");
            int turkce1 = scanner.nextInt();
            int matematik1 = scanner.nextInt();
            int edebiyat1 = scanner.nextInt();
            int fizik1 = scanner.nextInt();
            scanner.nextLine();

            //İkinci Öğrenci  //  26
            System.out.println("İkinci Öğrencinin İsmi : ");
            String isim2 = scanner.nextLine();

            System.out.print("İkinci Öğrencinin Netlerini Giriniz (Sırasıyla Türkçe Matematik Edebiyat Fizik şeklinde) : ");
            int turkce2 = scanner.nextInt();
            int matematik2 = scanner.nextInt();
            int edebiyat2 = scanner.nextInt();
            int fizik2 = scanner.nextInt();
            scanner.nextLine();

            //Üçüncü Öğrenci  //  27
            System.out.println("Üçüncü Öğrencinin İsmi : ");
            String isim3 = scanner.nextLine();

            System.out.print("Üçüncü Öğrencinin Netlerini Giriniz (Sırasıyla Türkçe Matematik Edebiyat Fizik şeklinde) : ");
            int turkce3 = scanner.nextInt();
            int matematik3 = scanner.nextInt();
            int edebiyat3 = scanner.nextInt();
            int fizik3 = scanner.nextInt();
            scanner.nextLine();


            System.out.println("İşlemi giriniz : ");   //  20
            String islem = scanner.nextLine();



            if (islem.equals("1")) {  //  22

                EsitAgirlik ogrenci1 = new EsitAgirlik(turkce1,matematik1,edebiyat1,fizik1, isim1);  //  28
                EsitAgirlik ogrenci2 = new EsitAgirlik(turkce2,matematik2,edebiyat2,fizik2, isim2);  //  29
                EsitAgirlik ogrenci3 = new EsitAgirlik(turkce3,matematik3,edebiyat3,fizik3, isim3);  //  30

                EsitAgirlik birinci = birinci(ogrenci1, ogrenci2, ogrenci3);  //  31

                System.out.println("Birinciliği Kazanan Eşit Ağırlık Öğrencisi : " + birinci.getIsim());  //  32

                System.out.println("Öğrenci Puanı : " + birinci.puanHesapla());  //  38


            }
            else if (islem.equals("2")) {  //  23

                Sayisal ogrenci1 = new Sayisal(turkce1,matematik1,edebiyat1,fizik1, isim1);  //  33
                Sayisal ogrenci2 = new Sayisal(turkce2,matematik2,edebiyat2,fizik2, isim2);  //  34
                Sayisal ogrenci3 = new Sayisal(turkce3,matematik3,edebiyat3,fizik3, isim3);  //  35

                Sayisal birinci = birinci(ogrenci1, ogrenci2, ogrenci3);  //  36

                System.out.println("Birinciliği Kazanan Sayisal Öğrencisi : " + birinci.getIsim());  //  37

                System.out.println("Öğrenci Puanı : " + birinci.puanHesapla());  //  39



            }
            else {  //  24
                System.out.println("Geçersiz İşlem...");
            }


        }


    }

    public static <E extends Aday> E birinci(E e1, E e2, E e3) {  //  E e3 eklendi.  //  9

        if (e1.puanHesapla() > e2.puanHesapla() && e1.puanHesapla() > e3.puanHesapla()) {   //  e1 diğer ikisinden büyük durumu.  //  10
            return e1;  //  Büyük olan e1 dönecek.

        }
        else if (e2.puanHesapla() > e1.puanHesapla() && e2.puanHesapla() > e3.puanHesapla()) {   //  e2 diğer ikisinden büyük durumu.  //  11
            return e2;  //  Büyük olan e2 dönecek.

        }
        else if (e3.puanHesapla() > e2.puanHesapla() && e3.puanHesapla() > e1.puanHesapla()) {   //  e3 diğer ikisinden büyük durumu.  //  12
            return e3;  //  Büyük olan e3 dönecek.

        }
        else {
            return e1;  /* Herhangi biri diğerlerinden büyük değilse. Yani üçünün de eşit olma durumu. e1 dönsün dedik.
                           e2 veya e3 de verilebilirdi, farketmez. */  //  13

        }


    }
}