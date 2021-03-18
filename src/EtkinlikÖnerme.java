import java.util.Scanner;

public class EtkinlikÖnerme {
    public static void main(String[] args) {
        // Hava sıcaklıgını al
        // Sıcaklık 30 derecenin ustunde ise yuzme öner.
        // 10 ve 30 derece arasında ise sinema öner.
        // 4 ve daha az ise kayak yapmayı öner.

        int sıcaklık;
        Scanner scan=new Scanner(System.in);
        System.out.print("Hava Sıcaklıgını Giriniz:");
        sıcaklık=scan.nextInt();

        if(sıcaklık>30){
            System.out.print("Bu hava da yuzmeye gidilir.");
        }else if(sıcaklık>10 && sıcaklık<30){
            System.out.print("Bu hava da sinemaya gidilir.");
        }else {
            System.out.print("Bu havalarda kayak yapmaya gidilir.");
        }




    }
}
