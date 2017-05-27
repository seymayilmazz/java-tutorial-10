/**
 * Created by Şeyma Yılmaz on 27.5.2017.
 */
public class Main {

    public static void main(String[] args) {

        /* statik metot ornegi */
        Matematik.usAl(2, 3);

        Matematik matematik = new Matematik();
        matematik.karekokAl(16);

        /* statik degisken ornegi */
        Ogrenci ogrenci1 = new Ogrenci();
        System.out.println("ogrenci sayisi : " + Ogrenci.ogrenciSayisi);
        Ogrenci ogrenci2 = new Ogrenci();
        System.out.println("ogrenci sayisi : " + Ogrenci.ogrenciSayisi);
    }

}
