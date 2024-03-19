import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int l = s.length();
        int n = Integer.parseInt(s);
        int m = Integer.MAX_VALUE;
        String r = "";
        int t = (int) Math.pow(10, l);
        int[] a = new int[l];
        for (int i = 0; i < l; i++) {
            a[i] = i;
        }
        do {
            int b = 0;
            for (int c : a) {
                b = b * 10 + c;
            }
            int tm = Math.max(Math.abs(n - b), t - Math.abs(n - b));
            if (m > tm) {
                m = tm;
                StringBuilder sb = new StringBuilder();
                for (int i : a) {
                    sb.append(i);
                }
                r = sb.toString();
            }
        } while (nextPermutation(a));
        System.out.println(r);
    }

    public static boolean nextPermutation(int[] a) {
        int i = a.length - 2;
        while (i >= 0 && a[i] >= a[i + 1]) {
            i--;
        }
        if (i < 0) {
            return false;
        }
        int j = a.length - 1;
        while (j >= 0 && a[i] >= a[j]) {
            j--;
        }
        swap(a, i, j);
        reverse(a, i + 1, a.length - 1);
        return true;
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void reverse(int[] a, int i, int j) {
        while (i < j) {
            swap(a, i++, j--);
        }
    }
}