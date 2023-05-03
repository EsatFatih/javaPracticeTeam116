package day05;

import java.util.Scanner;

public class Q3_KelimeyiTersineCevir {

    // SORU:kullanıcıdan bir cümle veya kelime girmesini isteyip
    // girilen değeri tersine  yazdıran bir method oluşturun

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir cumle ya da kelime giriniz");

        String kelime = scanner.nextLine();

        System.out.println(tersCevir(kelime));


    }

    public static String tersCevir(String word){

        String bosKova= "";

        for (int i = word.length(); i >=1 ; i--) {

            bosKova+=word.charAt(i-1);

        }

        String reversedWord = bosKova;

        return reversedWord ;


    }

}
