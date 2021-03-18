import java.util.Scanner;

public class doWhile_örnek {
    public static void main(String[] args) {
        //Negatif bir deger girilene kadar kullanıcıdan
        //girisleri kabul eden ve girilen degerlerden cift sayıları toplayan program

        Scanner scanner= new Scanner(System.in);
        int input,toplam=0;

        do{

            System.out.print("Bir sayı giriniz:");
            input=scanner.nextInt();

            if(input %2==0){
                toplam+=input;
            }

        }while(input>0);
        System.out.print("Cift sayıların toplamı:"+toplam);


        }
    }

