import java.util.*;

public class p03196 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();

        List<List<Integer>> factorization = factorization(p);
        int ans = 1;
        for (List<Integer> factor : factorization) {
            int base = factor.get(0);
            int exponent = factor.get(1);
            if (exponent >= n) {
                ans *= Math.pow(base, exponent / n);
            }
        }
        System.out.println(ans);
    }

    public static List<List<Integer>> factorization(int n) {
        List<List<Integer>> arr = new ArrayList<>();
        int temp = n;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (temp % i == 0) {
                int cnt = 0;
                while (temp % i == 0) {
                    cnt++;
                    temp /= i;
                }
                arr.add(Arrays.asList(i, cnt));
            }
        }

        if (temp!= 1) {
            arr.add(Arrays.asList(temp, 1));
        }

        if (arr.isEmpty()) {
            arr.add(Arrays.asList(n, 1));
        }

        return arr;
    }
}