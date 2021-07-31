package Vistula.egzamin_3;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String numer = sc.nextLine();
        numer.replace("-","");
        numer.replace(" ","");
        String []arr = numer.split("");
        System.out.println(arr.toString());



    }

}
