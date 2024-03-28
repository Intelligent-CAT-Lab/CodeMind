import java.util.*;
import java.io.*;
import java.math.*;
import java.util.function.*;
import java.util.stream.*;
import java.util.concurrent.*;

public class p02938 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int L = in.nextInt();
        int R = in.nextInt();
        in.close();
        System.out.println(solve(L,R));
    }
    public static int solve(int L, int R) {
        if (L > R) return 0;
        if (L == 1) return (1 + solve(2, R)) % 1000000007;
        return (solve(L/2,(R-1)/2) + solve((L+1)/2,R/2) + solve((L+1)/2,(R-1)/2)) % 1000000007;
    }
}