import java.util.*;
import java.io.*;
import java.lang.*;
import java.util.function.*;
import java.util.stream.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class p00957 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        int k = in.nextInt();
        System.out.println(new Main().solve(l, k));
    }

    public int solve(int l, int k) {
        int[] dp = new int[l + 1];
        dp[0] = 1;
        for (int i = 1; i <= l; i++) {
            dp[i] = dp[i - 1] + dp[i - k];
        }
        return Arrays.stream(dp).sum();
    }
}