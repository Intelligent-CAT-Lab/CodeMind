import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class p02722 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        Set<Integer> setl = new HashSet<>();
        setl.add(k);
        setl.add(k-1);
        for (int x = 2; x <= Math.sqrt(k) + 1; x++) {
            check(x, setl);
            check(k/x, setl);
        }
        if (setl.contains(1)) {
            setl.remove(1);
        }
        System.out.println(setl.size());
    }

    public static void check(int i, Set<Integer> setl) {
        int tot = k;
        while (tot % i == 0) {
            tot /= i;
        }
        if (tot % i == 1) {
            setl.add(i);
        }
    }
}