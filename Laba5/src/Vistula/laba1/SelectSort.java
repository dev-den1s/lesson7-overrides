package Vistula.laba1;

import java.util.Random;

public class SelectSort {
    public static void main(String[] args) {
        int[] arr=new int[10];
        Random random=new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i]=random.nextInt(1000);
        }
        for (int i :
                arr) {
            System.out.printf("%d ", i);
        }
        System.out.println();
        selectSort(arr);
        for (int i :
                arr) {
            System.out.printf("%d ", i);
        }
        System.out.println();
    }
    private static void selectSort(int[]arr){
        int index;
        for (int i = 0; i < arr.length; i++) {
            index=i;
            for (int j = i+1; j < arr.length; j++) {
                if(sumaCyfr(arr[j])<sumaCyfr(arr[index])){
                    index=j;
                }
            }
            //swap(arr[i], arr[index]);
            int tmp=arr[i];
            arr[i]=arr[index];
            arr[index]=tmp;
        }
    }
    private static int sumaCyfr(int num){
        int summa=0;
        while(num>0){
            summa+=num%10;
            num/=10;
        }
        return summa;
    }
}
