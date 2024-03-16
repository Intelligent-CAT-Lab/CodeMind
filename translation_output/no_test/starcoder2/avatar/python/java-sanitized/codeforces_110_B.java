import java.util.*;
import java.io.*;
import java.math.*;

public class codeforces_110_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("abcd".repeat(n / 4) + "abc".substring(0, n % 4));
    }
}