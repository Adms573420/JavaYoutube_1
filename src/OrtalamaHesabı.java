import java.util.Scanner;

public class OrtalamaHesabı {
    public static void main(String[] args) {
        int quiz, vize, ffinal;
        double ortalama;
        Scanner scan = new Scanner(System.in);
        System.out.println("Quiz Notunuzu Giriniz: ");
        quiz= scan.nextInt();
        System.out.println("Vize Notunuzu Giriniz: ");
        vize=scan.nextInt();
        System.out.println("ffinal Notunuzu Giriniz: ");
        ffinal=scan.nextInt();

        ortalama=(quiz*0.2)+(vize*0.35)+(ffinal*0.45);
        System.out.println("Ortalamanız: "+ortalama);
        String sonuc=(ortalama>50) ? "Gectiniz":"Kaldınız";
        System.out.println("Notunuz: "+sonuc);

    }



}
