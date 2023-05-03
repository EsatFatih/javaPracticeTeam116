package day04;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayGoruntuleme {
    public static void main(String[] args) {

         // printArrayMethod();

        ArrayElemanlariToplami();
    }

    // Bie array in degerlerinin gösteren bir java programi olsturun

    // int bir array olusturalim
    // Bir array create etmek icin once data turunu ve size ını tanimlamamiz gerekiyor
    static int size; // birden fazla array create etmek istersek size ı heryerde kullanabiliriz

    // birden fazla method icinde kullanicidan veri alabilmek ve tekrara dusmemek icin class level da olsturduk
    static Scanner scanner = new Scanner(System.in);

    // Kullanici tarafindan create edilen bir array

    public static void printArrayMethod(){

        // oncelikle kullaniciya array in size inin ne olmasi gerektigini soralim

        System.out.println("Lutfen Array in size ini belirtelim...");
        size = scanner.nextInt();
        // Kullanicidan aldigimiz size ile array in size ını olusturmus olduk

        int [] ogrencilerinYaslari = new int[size];

        // simdi array icerisine veri eklemeliyiz

        System.out.println("Lutfen ogrencilerin yaslarini giriniz");

        for (int i = 0; i < size; i++) {
            System.out.println(i+1+". veri");
            ogrencilerinYaslari[i]= scanner.nextInt();

        }


        // girilen array verilerinin print ini almak icin bir for l0op olusturmaliyiz


         System.out.println("Olusturulan Array icerisindeki verilerin ciktisi....");

        // Array icindeki elemanlar tek tek dısari çıkarilip yazdiriliyor

         for (int i = 0; i < size; i++) {
            System.out.print(ogrencilerinYaslari[i]+ " ");

        }

        System.out.println("");

         // Array in ciktisi aliniyor
        System.out.println(Arrays.toString(ogrencilerinYaslari));


    }

    // Kullanicidan alinan size ile bir int array olusturun ve array icerisindeki elemenlarin
    // toplamini veren bir java methodu olusturun

    public static void ArrayElemanlariToplami(){

        System.out.println("Lutfen Array in size ini belirtin...");
        size = scanner.nextInt();

        int [] employeeSalary= new int[size];

        // Array'ı create etmek icin for loop kullanalim


        for (int i = 0; i < size; i++) {
            System.out.println(1+i+". calisan");
            employeeSalary[i] = scanner.nextInt();

        }

        // Array icindeki verilerin toplami

         int sayac=0;

         for (int i = 0; i < size; i++) {

            sayac+=employeeSalary[i];

         }
         System.out.println("Calisanlarin maaslari toplami: "+sayac);



    }
}
