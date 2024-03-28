import java.util.*;

public class p02722 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        Set<Integer> setl = new HashSet<>();
        setl.add(k);
        setl.add(k - 1);
        for (int x = 2; x <= Math.sqrt(k); x++) {
            check(x, k);
        }
        if (setl.contains(1)) {
            setl.remove(1);
        }
        System.out.println(setl.size());
    }

    public static void check(int x, int k) {
        int tot = k;
        while (tot % x == 0) {
            tot /= x;
        }
        if (tot % x == 1) {
            setl.add(x);
        }
    }
}