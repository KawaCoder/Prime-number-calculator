import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


//FREE CODE! Do what you want with it! ;)


public class primeNumbersCalculator {


    public static long startTime;
    public static long endTime;



    public static void main(String[] args) throws IOException {

        ArrayList<Integer> nombres_premiers = new ArrayList<Integer>();
        boolean nope = false;

        Scanner sc = new Scanner(System.in);


        System.out.println("Up to what number do you want to compute the primes numbers?");
        int nbofpn = sc.nextInt();

        System.out.println("The prime numbers found will be saved in a text file \nnamed \"Prime_number"+nbofpn+".txt\" in the same directory as the primeNumberCalculator.jar file. \nFrom which number to start?");
        int nombre = sc.nextInt();



        startTime = System.currentTimeMillis();
        for (int i = 0; i <= nbofpn; i++){
            nope = false;

            for (int ii = 2; ii <= nombre / 2; ii++) {

                if (nombre % ii == 0) {
                    nope = true;
                    break;
                }

            }
            if (!nope){
                nombres_premiers.add(nombre);
                System.out.println(nombre);


            }


            nombre++;
        }

        endTime = System.currentTimeMillis();
        String nombrestr = String.valueOf(nombres_premiers);

        FileOutputStream fos=new FileOutputStream("Prime_numbers"+ nbofpn, true);
        byte[] b= nombrestr.getBytes();
        fos.write(b);
        fos.close();
        System.out.println("Prime_number"+nbofpn+".txt saved. The prime numbers up to " + nbofpn + " have been found in "+(endTime - startTime)+" ms.");

    }
}


