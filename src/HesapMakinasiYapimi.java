import java.util.Scanner;

public class HesapMakinasiYapimi {
    public static void main(String args[]){
        int sayi1,sayi2;

        Scanner scan =new Scanner(System.in);
        System.out.print("Birinci Sayıyı Giriniz:");
        sayi1=scan.nextInt();
        System.out.print("İkinci Sayıyı Giriniz:");
        sayi2=scan.nextInt();
        System.out.println("Yapmak istediginiz İslemi Seciniz:");
        System.out.println("1-Toplama\n2-Cıkarma\n3-Carpma\n4-Bölme");

        System.out.print("Seciminiz:");
        int  secim= scan.nextInt();
        if(secim==1){
            System.out.print("Toplama İsleminin Sonucu:"+(sayi1+sayi2));
        }else if(secim==2){
            System.out.print("Cıkarma İsleminin Sonucu:"+(sayi1-sayi2));
        }else if(secim==3){
            System.out.print("Carpma İsleminin Sonucu:"+(sayi1*sayi2));
        }else if(secim==4){
           if(sayi2==0){
               System.out.println("Bölme isleminin sonucu belirsizdir.");
           }else{
               System.out.print("Bölme İsleminin Sonucu:"+(sayi1/sayi2));
           }
        }else{
            System.out.println("Geceresiz Bir Sayı Girdiniz.");
        }


    }
}
