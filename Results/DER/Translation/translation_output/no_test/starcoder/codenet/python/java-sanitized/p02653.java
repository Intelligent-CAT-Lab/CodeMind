import java.util.*;
import java.io.*;

public class p02653 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int p = 1000000007;
        int[] xs0 = new int[n+1];
        int[] os0 = new int[n+1];
        os0[0] = 1;
        for(int i = b; i <= a-1; i++){
            for(int j = b; j <= i; j++){