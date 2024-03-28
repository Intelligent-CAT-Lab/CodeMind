import java.util.*;
import java.io.*;

public class p01555 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int D = 20;
        int[] ds = new int[D];
        for (int i = 1; i < D; i++) {
            int fr = (int) Math.pow(10, i-1) - 1;
            int to = (int) Math.pow(10, i) - 1;
            ds[i] = ds[i-1] + (4-i)*(to/3 + to/5 - (to/15)*2 - fr/3 - fr/5 + (fr/15)*2) + (8-i)*(to/15 - fr/15) + i*(to-fr);
        }
        int s = in.nextInt();
        int left = 0, right = (int) Math.pow(10, 18);
        while (left+1 < right) {
            int mid = (left + right) / 2;
            if (calc(mid) <= s-1) {
                left = mid;
            } else {
                right = mid;
            }
        }
        int idx = calc(left);
        int num = left+1;
        String ans = "";
        while (ans.length() < s - idx + 20) {
            if (num % 15 == 0) {
                ans += "FizzBuzz";
            } else if (num % 3 == 0) {
                ans += "Fizz";
            } else if (num % 5 == 0) {
                ans += "Buzz";
            } else {
                ans += num;
            }
            num++;
        }
        System.out.println(ans.substring(s-idx-1, s-idx+19));
    }

    public static int calc(int m) {
        if (m == 0) {
            return 0;
        }
        int c = (int) Math.log10(m) + 1;
        int fr = (int) Math.pow(10, c-1) - 1;
        int to = m;
        return ds[c-1] + (4-c)*(to/3 + to/5 - (to/15)*2 - fr/3 - fr/5 + (fr/15)*2) + (8-c)*(to/15 - fr/15) + c*(to-fr);
    }
}