import java.util.Scanner;

public class DaireAlanVeCevreHesabı {
    public static void main(String[] args) {
        int yarıcap;
      double pi=3.14;

      Scanner scan=new Scanner(System.in);
      System.out.println("Yarıcapı Giriniz: ");
      yarıcap= scan.nextInt();
      double alan=pi*yarıcap*yarıcap;
      double cevre=2*pi*yarıcap;

      System.out.println("Dairenin Alanı:"+alan);
      System.out.println("Dairenin Cevresi:"+cevre);




    }
}
