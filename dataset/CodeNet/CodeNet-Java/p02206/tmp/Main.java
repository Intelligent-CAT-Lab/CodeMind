import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
System.out.println("[INST]5;n;sc.nextLong();"+n);
        long k = sc.nextLong();
System.out.println("[INST]6;k;sc.nextLong();"+k);
        long left = 1;
        long right = k + 1;
        while (right - left > 1) {
            long m = (left + right) / 2;
            long x = m;
            long total = 0;
            for (int i = 0; i < n && x > 0 && total <= k; i++) {
                total += x;
                x /= 2;
            }
            if (total <= k) {
                left = m;
            } else {
                right = m;
            }
        }
        System.out.println(left);
    }
}

