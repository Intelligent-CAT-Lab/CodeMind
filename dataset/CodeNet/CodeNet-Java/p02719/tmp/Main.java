import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
System.out.println("[INST]7;n;sc.nextLong();"+n);
        long k = sc.nextLong();
System.out.println("[INST]8;k;sc.nextLong();"+k);
        long ans = Math.min(n%k, k-(n%k));
System.out.println("[INST]9;ans;Math.min(n%k, k-(n%k));"+ans);
        System.out.println(ans);
    }

}