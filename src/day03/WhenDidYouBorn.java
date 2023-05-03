package day03;

import java.util.Scanner;

public class WhenDidYouBorn {

    // Kullanıcıya hangi ayda dogdugunu sorun ve dogdugu ayin hangi
    // mevsimde oldugunu bulan bir java program yazınız

    static Scanner scan = new Scanner(System.in);

    static String month;
    static String season = null;
    static String january ="january";
    static String february ="february";
    static String march ="march";
    static String april ="april";
    static String may ="may";
    static String june ="june";
    static String july ="july";
    static String august ="august";
    static String september ="september";
    static String october ="october";
    static String november ="november";
    static String december ="december";

    public static void birthday(){

        System.out.println("Please enter the month you born in");
        month = scan.next();

        if (month.equalsIgnoreCase(january) || month.equalsIgnoreCase(february)|| month.equalsIgnoreCase(december)){

            season ="Winter";
        } else if (month.equalsIgnoreCase(march) || month.equalsIgnoreCase(april)|| month.equalsIgnoreCase(may)) {
            season ="Spring";
        }else if (month.equalsIgnoreCase(june) || month.equalsIgnoreCase(july)|| month.equalsIgnoreCase(august)) {
            season ="summer";
        } else if (month.equalsIgnoreCase(september) || month.equalsIgnoreCase(november)|| month.equalsIgnoreCase(december)) {
            season ="autumn";
        }else {
            System.out.println("Invalid input");
            birthday(); // nethod call
        }
        System.out.println("You were born in :" + season);

    }

    public static void main(String[] args) {

        birthday();
    }




}
