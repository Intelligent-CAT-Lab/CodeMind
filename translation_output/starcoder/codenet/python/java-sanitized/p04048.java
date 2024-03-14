import java.util.*;
import java.io.*;

public class p04048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        System.out.println((n-Math.gcd(n, x))*3);
    }
}