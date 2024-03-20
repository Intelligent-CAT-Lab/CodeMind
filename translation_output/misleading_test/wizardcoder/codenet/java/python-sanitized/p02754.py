import java.util.*;
import java.io.*;

public class p02754 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long ans = 0;
        ans = (n / (a + b)) * a + Math.min(a, n % (a + b));
        System.out.println(ans);
    }
}