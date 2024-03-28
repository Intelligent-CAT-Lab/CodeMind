import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class p02660 {

    public static ArrayList<Integer> primeFactorize(int n) {
        ArrayList<Integer> a = new ArrayList<>();
        while (n % 2 == 0) {
            a.add(2);
            n /= 2;
        }
        int f = 3;
        while (f * f <= n) {
            if (n % f == 0) {
                a.add(f);
                n /= f;
            } else {
                f += 2;
            }
        }
        if (n != 1) {
            a.add(n);
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> res = primeFactorize(n);
        if (res.size() == 1) {
            System.out.println(1);
        } else {
            int cnt = 0;
            Integer c = null;
            int p = 0;
            Set<Integer> l = new HashSet<>();
            for (Integer r : res) {
                if (c != null && c.equals(r)) {
                    p++;
                    if (!l.contains(p)) {
                        l.add(p);
                        p = 0;
                        cnt++;
                    }
                } else {
                    l.clear();
                    p = 0;
                    l.add(1);
                    cnt++;
                    c = r;
                }
            }
            System.out.println(cnt);
        }
    }
}