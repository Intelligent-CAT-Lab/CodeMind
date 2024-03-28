import java.util.*;

public class p02722 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        
        Set<Integer> set = new HashSet<>();
        set.add(k);
        set.add(k-1);
        
        for (int x = 2; x <= Math.sqrt(k); x++) {
            check(set, k, x);
            check(set, k, k/x);
        }
        
        set.remove(1);
        System.out.println(set.size());
    }
    
    public static void check(Set<Integer> set, int k, int i) {
        int tot = k;
        while (tot % i == 0) {
            tot /= i;
        }
        if (tot % i == 1) {
            set.add(i);
        }
    }
}