import java.util.*;
import java.io.*;

public class atcoder_AGC025_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = Integer.MAX_VALUE;
        for (int a = 1; a < N; a++) {
            int b = N - a;
            ans = Math.min(ans, dsum(a) + dsum(b));
        }
        System.out.println(ans);
    }

    public static int dsum(int x) {
        String numString = String.valueOf(x);
        int sum = 0;
        for (int i = 0; i < numString.length(); i++) {
            sum += Character.getNumericValue(numString.charAt(i));
        }
        return sum;
    }
}