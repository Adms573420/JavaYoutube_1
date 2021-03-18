import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Kullanıcı Adı Giriniz:");
        String k_adi=scan.nextLine();
        System.out.print("Sifrenizi giriniz:");
        String sifre=scan.nextLine();
        if(k_adi.equals("Ahmet") && sifre.equals("123") ){
            System.out.print("Basarılı bir giris yaptınız.");
        }else{
            System.out.print("Kullanıcı adı ya da sifre de hata yaptınız.");
        }

        }

    }
