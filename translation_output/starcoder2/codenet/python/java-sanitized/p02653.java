import java.util.*;
import java.io.*;
import java.math.*;

public class p02653 {
    static int n,a,b;
    static long p = 1000000007;
    static long[] xs0,os0;
    static long[] os;
    static long[] x,o;
    static long[] beki2;
    static long ans;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();
        if(a<b){
            int tmp = a;
            a =