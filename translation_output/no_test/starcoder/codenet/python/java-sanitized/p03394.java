import java.util.*;
import java.io.*;

public class p03394 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] P2 = new int[5000][3];
        int[][] P3 = new int[2500][2];
        for (int i = 0; i < 5000; i++) {
            P2[i][0] = 6 * (i + 1) - 2;
            P2[i][1] = 6 * (i + 1);
            P2[i][2] = 6 * (i + 1) + 2;
        }
        P2[4999][2] = 2;
        for (int i = 0; i < 2500; i++) {
            P3[i][0] = 12 * i + 3;
            P3[i][1] = 12 * i + 9;
        }
        if (N == 3) {
            System.out.println(2 + " " + 3 + " " + 25);
        } else if (N == 4) {
            System.out.println(2 + " " + 3 + " " + 4 + " " + 9);
        } else if (N == 6) {
            System.out.println(2 + " " + 3 + " " + 4 + " " + 6 + " " + 9 + " " + 12);
        } else {
            int k = -(-(N - 12500) / 3);
            N -= 3 * k;
            int m = N % 5;
            if (m == 0) {
                System.out.println(2 + " " + 3 + " " + 4 + " " + 6 + " " + 9 + " " + 12);
            } else if (m == 1) {
                System.out.println(2 + " " + 3 + " " + 4 + " " + 6 + " " + 9 + " " + 12);
            } else if (m == 2) {
                System.out.println(2 + " " + 3 + " " + 4 + " " + 6 + " " + 9 + " " + 12);
            } else if (m == 3) {
                System.out.println(2 + " " + 3 + " " + 4 + " " + 6 + " " + 9 + " " + 12);
            } else if (k >= 2499) {
                System.out.println(2 + " " + 3 + " " + 4 + " " + 6 + " " + 9 + " " + 12);
            } else {
                System.out.println(2 + " " + 3 + " " + 4 + " " + 6 + " " + 9 + " " + 12);
            }
        }
    }
}