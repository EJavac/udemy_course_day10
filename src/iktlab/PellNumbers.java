package iktlab;

import java.util.Scanner;

public class PellNumbers {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
        System.out.println(" Istenilen ededi daxil edin:");
        int daxilEdilenRegem = scan.nextInt();
        int birinciEded =1, ikinciEded =0, alinanEded;
        for(int i = 1; i<=daxilEdilenRegem; i++){

            alinanEded = birinciEded + 2*ikinciEded;

            System.out.println(alinanEded + " ");

             birinciEded =ikinciEded;
           ikinciEded = alinanEded;

        }

}
}
