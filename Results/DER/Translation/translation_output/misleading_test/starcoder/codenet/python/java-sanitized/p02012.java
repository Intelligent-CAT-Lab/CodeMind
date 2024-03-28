import java.util.*;
import java.io.*;
public class p02012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        int[] dp = new int[n+1];
        for(int i=1;i<=n;i++) {
            arr[i] = i;
        }
        for(int i=2;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                if(arr[j] > arr[i-j]) {
                    arr[i] = arr[j];
                } else {
                    arr[i] = arr[i-j];
                }
            }
        }
        System.out.println(arr[n]);
    }
}