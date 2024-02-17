import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static List<Long> divisors(long n) {
        List<Long> list = new ArrayList<>();
        for (long i = 1; i * i < n; i++) {
            if (n % i != 0) {
                continue;
            }
            list.add(i);
            if (i != 1 && i * i != n) {
                list.add(n / i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        List<Long> divs = divisors(n);
        long ans = 0;
        for (long div : divs) {
            if (div > 1000000) {
                continue;
            }
            if (n > div * div + div) {
                ans += (n - div) / div;
            }
        }
        System.out.println(ans);
    }

}
