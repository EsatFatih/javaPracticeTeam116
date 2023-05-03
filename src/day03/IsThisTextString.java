package day03;

import java.util.Scanner;

public class IsThisTextString {

    // Kullanıcıdan alinan karakterlerin
    // string olup olmadıgını kontrol eden bir java program yazınız

    static Scanner scan = new Scanner(System.in);


    public static void isThisString(){

        System.out.println("Please Input a String text....");

        // Kullanıcı int bir giris yapabilir. kontrol etmemiz gerek

        if (scan.hasNextInt()){ // scan.nextInt() .... eger scan yani kullanıcının giris yaptıgı data int ise true olur
            int input = scan.nextInt();
            System.out.println("This is an integer input :"+input);
            isThisString(); // method call yaptık
        } else if (scan.hasNextDouble()) {
            double doubleinput = scan.nextDouble();
            System.out.println("This is an double input :"+doubleinput);
            isThisString();

        } else if (scan.hasNext()) {
            String stringData = scan.next();
            System.out.println("Great this is string input......");

        }

    }
    /*

        Kullanıcı karısık string ve int girerse??
        for dongusu ile her bir karaktere bakılabilir

     */

    public static void main(String[] args) {
        isThisString();
    }
}
