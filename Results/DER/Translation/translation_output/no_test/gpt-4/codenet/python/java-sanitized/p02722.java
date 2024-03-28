import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class p02722 {
    private static Set<Integer> setl = new HashSet<>();
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        
        setl.add(k);
        setl.add(k - 1);
        
        for (int x = 2; x <= (int) Math.sqrt(k); ++x) {
            check(x, k);
            if (k / x != x) { // Avoid double checking for perfect squares
                check(k / x, k);
            }
        }
        
        if (setl.contains(1)) {
            setl.remove(1);
        }
        
        System.out.println(setl.size());
        
        scanner.close();
    }

    private static void check(int i, int k) {
        int tot = k;
        while (tot % i == 0) {
            tot /= i;
        }
        if (tot % i == 1) {
            setl.add(i);
        }
    }
}