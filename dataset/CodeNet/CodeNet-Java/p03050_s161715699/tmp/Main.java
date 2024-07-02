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
System.out.println("[INST]12;None;list.add(i);"+list.add(i));
            if (i != 1 && i * i != n) {
                list.add(n / i);
System.out.println("[INST]14;None;list.add(n / i);"+list.add(n / i));
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
System.out.println("[INST]22;n;sc.nextLong();"+n);
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
