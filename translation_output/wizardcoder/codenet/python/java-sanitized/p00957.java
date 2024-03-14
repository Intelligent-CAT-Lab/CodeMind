import java.util.*;
import java.util.function.*;

public class p00957 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int k = sc.nextInt();
        sc.close();

        IntBinaryOperator rec = new IntBinaryOperator() {
            private Map<Integer, Integer> cache = new HashMap<>();

            @Override
            public int applyAsInt(int i, int isBlack) {
                if (i < 0) return 0;
                if (i == 0) return 1 - isBlack;  // black at bottom
                if (isBlack == 1) { // top is black
                    if (cache.containsKey(i)) return cache.get(i);
                    int res = applyAsInt(i - 1, 0) + applyAsInt(i - k, 0);
                    cache.put(i, res);
                    return res;
                } else {  // top is white
                    if (cache.containsKey(i)) return cache.get(i);
                    int res = applyAsInt(i - 1, 1) + applyAsInt(i - k, 1);
                    cache.put(i, res);
                    return res;
                }
            }
        };

        int ans = IntStream.rangeClosed(1, l).map(i -> rec.applyAsInt(i, 1)).sum();

        System.out.println(ans);
    }
}