import java.util.*;

public class p02722 {
    static int k;
    static Set<Integer> setl = new HashSet<>();

    static void check(int i) {
        int tot = k;
        while (tot % i == 0) {
            tot /= i;
        }
        if (tot % i == 1) {
            setl.add(i);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        k = scanner.nextInt();
        setl.add(k);
        setl.add(k - 1);
        for (int x = 2; x <= Math.sqrt(k); x++) {
            check(x);
            if (k % x == 0) {
                check(k / x);
            }
        }
        if (setl.contains(1)) {
            setl.remove(1);
        }
        System.out.println(setl.size());
    }
}