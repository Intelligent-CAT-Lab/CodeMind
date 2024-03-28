import java.util.*;
import java.math.*;

public class p02653 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        int[] xs0 = new int[n+1];
        int[] os0 = new int