package timGTNN;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int m,n;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap so dong");
        m=scanner.nextInt();
        System.out.println("Nhap so cot");
        n=scanner.nextInt();
        int[][] arr=new int[m][n];
        System.out.println("Nhap cac phan tu");
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                System.out.print("A[" + i + "]["+ j + "] = ");
                arr[i][j]=scanner.nextInt();
            }
        }
        int min=arr[0][0];
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if (min>arr[i][j]){
                    min=arr[i][j];
                }
            }

        }
        System.out.println("Phan tu nho nhat = " +min);
    }


}
