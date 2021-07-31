package Vistula.laba1;

import java.util.Scanner;

public class eratostenes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number ...");
        int n = scan.nextInt();
        boolean[] arr=new boolean[n+1];
        arr[0]=false;
        arr[1]=false;
        for(int i=2; i < arr.length; i++)
            arr[i] = true;

        for (int i = 2; i < arr.length; i++) {
            if(arr[i]){
                for(int j=i*2; j< arr.length; j+=i)
                    arr[j]=false;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i])
                System.out.printf("%d ", i);
        }
        System.out.println();
    }
}
