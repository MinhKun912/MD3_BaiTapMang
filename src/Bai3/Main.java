package Bai3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println(" Nhap do dai cua 2 mang");
        int size1=scanner.nextInt();
        int[]arr1=new int[size1];
                for (int i=0;i<arr1.length;i++){
                    System.out.println("Nhap phan tu arr1");
                    int input1=scanner.nextInt();
                    arr1[i]=input1;
                }
        int[]arr2=new int[size1];
        for (int i=0;i<arr1.length;i++){
            System.out.println("Nhap phan tu arr2");
            int input2=scanner.nextInt();
            arr2[i]=input2;
        }
        int[] newArr = new int[arr1.length+arr2.length];
        int push=0;
        for (int element: arr1){
            newArr[push]=element;
            push    ++;
        }
        for (int element: arr2){
            newArr[push]=element;
            push    ++;
        }
        System.out.println("newArr"+ Arrays.toString(newArr));
    }
}
