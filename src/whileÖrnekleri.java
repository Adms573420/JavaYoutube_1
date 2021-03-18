import java.util.Scanner;

public class whileÖrnekleri {
    public static void main(String[] args) {
        ////Örnek 1= 1 den 100 e kadar olan cift sayıları yazdırınız.

        //int i=1;
        //while(i<=100){
        //    if(i%2==0){
        //        System.out.print(i+"-");
        //    }
        //    i++;
        //}

       /* //Örnek 2= Negatif bir deger girilene kadar kullanıcıdan
        // girisleri kabul eden ve girilen degerlerden tek sayıları toplayan program

        Scanner scanner=new Scanner(System.in);

        int toplam=0;
        int input;

        while(true){
            System.out.print("Lutfen bir sayı giriniz:");
            input=scanner.nextInt();
            if(input<0){
                System.out.println("İslemi Sonlandır!!");
                break;
            }
            if(input % 2==1){
                toplam += input;

                input++;
            }

        }
        System.out.print("Tek sayıların toplamı: "+toplam);


    }*/
        //Örnek 3= Girilen sayıya kadar 2 nin kuvvetleri

        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int input=scanner.nextInt();
        int k=1;
        while(k<=input){
            k=k*2;
            System.out.println(k);


        }

    }
}
