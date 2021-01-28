package iktlab;

import java.util.*;
import java.util.Arrays;

public class Day10 {
   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Istenilen sozu daxil edin: ");
        String consoleWord = scan.nextLine();
        String inputString = consoleWord;
        String outputString = sortString(inputString);

        System.out.println("Daxil edilen soz  : " + inputString);
        System.out.println("Netice : " + outputString  + " ");
    }

        public static String sortString(String convertString)
        {
            char yeniSoz[] = convertString.toCharArray();
            Arrays.sort(yeniSoz);
            return new String(yeniSoz);
        }
    }






