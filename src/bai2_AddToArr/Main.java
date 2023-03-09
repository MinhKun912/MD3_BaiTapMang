package bai2_AddToArr;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        logic(arr,addNumber(),index());
    }
    static int addNumber(){
        System.out.println("Nhap so c an them");
        int input=scanner.nextInt();
        return input;
    }

    static int index(){
        System.out.println("Nhap vi tri muon thay the");
         int index=scanner.nextInt();
         return index;
    }
    static  void logic(int[] arr ,int addNumber,int index ){
        int[] newArr = new int[arr.length+1];
        for (int i=0;i< newArr.length;i++){
            if (index>i){
                newArr[i]=arr[i];
            } else if (index==i) {
                newArr[i]=addNumber;

            }else {
                newArr[i]=arr[i-1];

            }

            System.out.println(i + "newArr " + Arrays.toString(newArr));
        }

    }
}






