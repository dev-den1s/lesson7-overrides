package Vistula.laba1;
import java.util.Scanner;

public class histogram {

    public static void main(String[] args) {
        int[]arr=new int[3];
        int max;
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<3;i++){
            System.out.printf("Enter %d number: ", i+1);
            arr[i]=scan.nextInt();
        }
        max = arr[0];
        for (int i=1; i<arr.length; i++) {
            max = arr[i]>max?arr[i]:max;
        }
        System.out.println(max);
        for(int i=max; i>0; i--){
            for (int j: arr) {
                //if(i<=j)
                System.out.print(i<=j?"*":" ");
            }
            System.out.println();
        }
    }
}
