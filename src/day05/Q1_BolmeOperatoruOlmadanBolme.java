package day05;

import java.util.Scanner;

public class Q1_BolmeOperatoruOlmadanBolme {
    // bolumu dongunun icerisinde saymasi icin her seferinde artacak bir sayac olusturdum:
    static int bolum=0;

    public static void main(String[] args) {

        // Kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru
        // kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create ediniz.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bolmek istediginiz sayiyi giriniz: ");
        int a = scanner.nextInt();

        System.out.println("Lutfen bolen sayiyi giriniz: ");
        int b = scanner.nextInt();


        System.out.println(bol(a, b));

        // System.out.println("Bolum :"+bolum);


    }
    public static int bol(int bolunen, int bolen){



        while(bolunen>=bolen){

            bolunen-=bolen;

            bolum++;
        }

        return bolum;

}
}
