import java.util.*;

public class p03196 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, p;
        n = sc.nextInt();
        p = sc.nextInt();
        List<int[]> l = factorization(p);
        int ans = 1;
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i)[1] >= n) {
                ans *= Math.pow(l.get(i)[0], l.get(i)[1] / n);
            }
        }
        System.out.println(ans);
    }

    public static List<int[]> factorization(int p) {
        List<int[]> arr = new ArrayList<>();
        int temp = p;
        for (int i = 2; i <= Math.sqrt(p); i++) {
            if (p % i == 0) {
                int cnt = 0;
                while (p % i == 0) {
                    cnt++;
                    p /= i;
                }
                arr.add(new int[]{i, cnt});
            }
        }
        if (p != 1) {
            arr.add(new int[]{p, 1});
        }
        if (arr.isEmpty()) {
            arr.add(new int[]{p, 1});
        }
        return arr;
    }
}