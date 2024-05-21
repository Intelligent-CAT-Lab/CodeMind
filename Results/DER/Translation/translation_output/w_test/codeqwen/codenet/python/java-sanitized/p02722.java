import java.util.HashSet;
import java.util.Set;

public class p02722 {
    public static void main(String[] args) {
        int k = Integer.parseInt(System.console().readLine());
        Set<Integer> setl = new HashSet<>();
        setl.add(k);
        setl.add(k - 1);
        for (int x = 2; x <= Math.sqrt(k); x++) {
            check(x, k, setl);
            check(k / x, k, setl);
        }
        if (setl.contains(1)) {
            setl.remove(1);
        }
        System.out.println(setl.size());
    }

    public static void check(int i, int k, Set<Integer> setl) {
        int tot = k;
        while (tot % i == 0) {
            tot /= i;
        }
        if (tot % i == 1) {
            setl.add(i);
        }
    }
}