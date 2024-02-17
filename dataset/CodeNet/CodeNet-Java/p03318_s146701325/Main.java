

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public final class Main {

    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final long n = Long.parseLong(in.nextLine());
        long k = 0, kk = 1;
        for (int i = 0; i < n; i++) {
            if ((k / kk) % 10 == 9 && f(k + kk) > f(k + 10 * kk)) { 
                kk *= 10;
            }
            k += kk;
            System.out.println(k);
        }
    }

    private static double f(long num) {
        long copy = num;
        long sum = 0;
        while (copy > 0) {
            sum += copy % 10;
            copy /= 10;
        }
        return (double) num / sum;
    }
}
