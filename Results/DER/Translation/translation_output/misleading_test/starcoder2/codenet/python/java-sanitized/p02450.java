import java.util.*;
import java.io.*;

public class p02450 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        List<int[]> perms = new ArrayList<>();
        permute(arr, 0, perms);
        for (int[] perm : perms) {
            for (int i = 0; i < perm.length; i++) {
                System.out.print(perm[i] + " ");
            }
            System.out.println();
        }
    }

    public static void permute(int[] arr, int start, List<int[]> perms) {
        if (start == arr.length - 1) {
            perms.add(arr.clone());
        } else {
            for (int i = start; i < arr.length; i++) {
                swap(arr, start, i);
                permute(arr, start + 1, perms);
                swap(arr, start, i);
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

/10-days-of-statistics/day-0-weighted-mean.md
# Day 0: Weighted Mean

Given an array, $X$, of $N$ integers and an array, $W$, representing the respective weights of $X$'s elements, calculate and print the weighted mean of $X$'s elements. Your answer should be rounded to a scale of $1$ decimal place (i.e., $12.3$ format).

**Input Format**