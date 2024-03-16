import java.util.*;
import java.io.*;

public class p02833 {
  
    public static long ncr(int n, int r) {
        r = Math.min(r, n - r);
        long numer = 1;
        long denom = 1;
        for (int i = 0; i < r; i++) {
            numer *= (n - i);
            denom *= (i + 1);
        }
        return numer / denom;
    }

    public static int read(int p) {
        Scanner sc = new Scanner(System.in);
        if (p == 0) {
            return Integer.parseInt(sc.nextLine());
        }
        if (p == 1) {
            return Integer.parseInt(sc.nextLine());
        }
        if (p == 2) {
            String[] parts = sc.nextLine().split(" ");
            int[] arr = new int[parts.length];
            for (int i = 0; i < parts.length; i++) {
                arr[i] = Integer.parseInt(parts[i]);
            }
            return arr;
        }
        if (p == 3) {
            String[] parts = sc.nextLine().split(" ");
            int[] arr = new int[parts.length];
            for (int i = 0; i < parts.length; i++) {
                arr[i] = Integer.parseInt(parts[i]);
            }
            return arr;
        }
    }

    public static void main(String[] args) {
        int t = 1;
        for (int term = 1; term <= t; term++) {
            int n = read(1);
            int div = 10;
            int tot = 0;
            if (n % 2 == 1) {
                System.out.println(0);
            } else {
                while (n >= div) {
                    tot += n / div;
                    div *= 5;
                }
                System.out.println(tot);
            }
        }
    }
}