import java.util.*;

public class atcoder_ABC114_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = aaa(0, N);
        System.out.println(ans);
    }

    public static int aaa(int n, int N) {
        if (n > N) {
            return 0;
        }
        int ans = 1;
        if (isSevenFiveThree(n)) {
            ans = 0;
        }
        for (int i = 0; i < 4; i++) {
            ans += aaa(n * 10 + i, N);
        }
        return ans;
    }

    public static boolean isSevenFiveThree(int n) {
        Set<Integer> set = new HashSet<>();
        while (n > 0) {
            int digit = n % 10;
            if (!set.add(digit)) {
                return false;
            }
            n /= 10;
        }
        return set.contains(7) && set.contains(5) && set.contains(3);
    }
}