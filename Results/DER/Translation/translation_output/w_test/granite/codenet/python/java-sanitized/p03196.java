import java.util.*;

public class p03196 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        List<List<Integer>> factors = factorization(p);
        int ans = 1;
        for (List<Integer> factor : factors) {
            int count = factor.get(1);
            while (count >= n) {
                ans *= Math.pow(factor.get(0), count / n);
                count -= n;
            }
        }
        System.out.println(ans);
    }

    public static List<List<Integer>> factorization(int n) {
        List<List<Integer>> factors = new ArrayList<>();
        int temp = n;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (temp % i == 0) {
                int count = 0;
                while (temp % i == 0) {
                    count++;
                    temp /= i;
                }
                factors.add(Arrays.asList(i, count));
            }
        }
        if (temp!= 1) {
            factors.add(Arrays.asList(temp, 1));
        }
        if (factors.isEmpty()) {
            factors.add(Arrays.asList(n, 1));
        }
        return factors;
    }
}