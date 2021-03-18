import java.util.Scanner;

public class KdvHesapla {
    public static void main(String[] args) {
        double tutar, KdvliFiyat,kdvOranı=0.18;

        Scanner scan=new Scanner(System.in);
        System.out.println("Tutarı Giriniz: ");
        tutar=scan.nextDouble();

        KdvliFiyat=tutar+tutar*kdvOranı;
        System.out.println("Kdv li Fiyatı: "+KdvliFiyat);



    }
}
