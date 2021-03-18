import java.util.Scanner;

public class SinifAtlama {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Turkce notunuzu giriniz: ");
        int turkce=scan.nextInt();
        System.out.print("Matematik notunuzu giriniz: ");
        int matematik=scan.nextInt();
        System.out.print("Fen Bilgisi notunuzu giriniz: ");
        int fenBilgisi=scan.nextInt();
        System.out.print("Sosyal Bilgiler notunuzu giriniz: ");
        int sosyalBilgiler=scan.nextInt();
        System.out.print("Beden Egitimi notunuzu giriniz: ");
        int bedenEgitimi=scan.nextInt();
        double ortalama=(turkce+matematik+fenBilgisi+sosyalBilgiler+bedenEgitimi)/5;
        if(ortalama<50){
            System.out.print("Sınıfta kaldınız.");
        }else{
            System.out.print("Sınıfı basarı ile gectiniz.");
        }
        System.out.print("\nYıl sonu ortalamanız: "+ortalama);

    }
}
