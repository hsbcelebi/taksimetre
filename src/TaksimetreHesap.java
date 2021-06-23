import java.util.Scanner;

public class TaksimetreHesap {

    public static void main(String[] args) {

        float taksimetreKM = (float) 2.2;
        float taksimetreMin = (float) 20.0;
        float taksimetreAcilis = (float) 10.0;

        float km;


        Scanner scan = new Scanner(System.in);

        System.out.print("Gidilen km yi giriniz : ");

        km = scan.nextFloat();

        System.out.print("Gidilen Km: " + km +" km");

        float odeme = km*taksimetreKM;

        if (odeme<20){

            System.out.println("\nÖdenmesi gereken tutar : " + taksimetreMin + " TL");
        }else {

            odeme = taksimetreKM * km;
            System.out.println("\nÖdenmesi gereken tutar : " + odeme + " TL");
        }



    }


}
