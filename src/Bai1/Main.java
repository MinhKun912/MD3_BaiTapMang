package Bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Scanner scanner = new Scanner(System.in);
        int delete = scanner.nextInt();
        int deleteIndex = findIndex(arr, delete);
        if (delete == 6) {
            System.out.println(delete+ "" + "So khonng co trong mang");
        } else {
            arr = deleteElement(arr, deleteIndex);
        }
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]+"");
        }

    }

    public static int findIndex(int[] arr, int delete) {
         int index = 6;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == delete) {
                index = i;
                break;
            }
        }
        return index;
    }

    static int[] deleteElement(int[] arr, int index) {
        int[] newArr = new int[arr.length-1];
        for (int i=0;i<index;i++){
            newArr[i]=arr[i];
        }
        for (int j=index+1;j<arr.length;j++){
            newArr[j-1]=arr[j];
        }
        return newArr;
    }
}

