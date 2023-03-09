package TinhTongCot;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int m, n;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số dòng : ");
        m = scanner.nextInt();
        System.out.println("Nhập vào số cột : ");
        n = scanner.nextInt();

        int A[][] = new int[m][n];

        System.out.println("Nhập các phần tử cho ma trận: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                A[i][j] = scanner.nextInt();
            }
        }
    for (int i=0;i<n;i++){
        int sum=0;
        for (int j=0;j<m;j++){
            sum +=A[j][i];
        } System.out.println("Tong Cua Cot"+i+"="+sum);
        }
        for (int i=0;i<n;i++){
            int sum=0;
            for (int j=0;j<m;j++){
                sum +=A[i][j];
            } System.out.println("Tong Cua hang"+i+"="+sum);
        }

    }



}
