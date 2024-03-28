import java.util.HashSet;
import java.util.Scanner;
import java.lang.Math;

public class p02722 {
    static HashSet<Integer> setl = new HashSet<Integer>();
    
    public static void check(int i, int k) {
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
        int k = scanner.nextInt();
        setl.add(k);
        setl.add(k - 1);
        for (int x = 2; x <= (int)Math.sqrt(k); ++x) {
            check(x, k);
            if(k / x != x) { // Prevent double checking for the square root
                check(k / x, k);
            }
        }
        if (setl.contains(1)) {
            setl.remove(1);
        }
        System.out.println(setl.size());
        scanner.close();
    }
}