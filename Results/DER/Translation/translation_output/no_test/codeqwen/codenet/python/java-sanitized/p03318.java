import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;

class Main {
    static final int MOD = 1000000007;
    static final int INF = Integer.MAX_VALUE;
    static final long LINF = Long.MAX_VALUE;
    static final double EPS = 1e-9;
    static final double PI = Math.PI;
    static final Random RANDOM = new Random();

    //A
    static void A() {
        String s = new Scanner(System.in).nextLine();
        int a = 0;
        int b = 0;
        for (char c : s.toCharArray()) {
            if (c == '-') {
                a++;
            } else {
                b++;
            }
        }
        System.out.println(b - a);
        return;
    }

    //B
    static void B() {
        String n = new Scanner(System.in).nextLine();
        int num = 0;
        for (char c : n.toCharArray()) {
            num += Character.getNumericValue(c);
        }
        int n_ = Integer.parseInt(n);
        System.out.println(n_ % num > 0 ? "Yes" : "No");
        return;
    }

    //C
    static void C() {
        int n = new Scanner(System.in).nextInt();
        int k = new Scanner(System.in).nextInt();
        new Scanner(System.in).nextLine();
        System.out.println((n - k) / (k - 1) + 1 + (n - k) % (k - 1) != 0);
        return;
    }

    //D
    static void D() {
        int K = new Scanner(System.in).nextInt();
        int ans = 1;
        int i = 0;
        double Sunuke(int a) {
            return (double) a / Stream.of(String.valueOf(a).split