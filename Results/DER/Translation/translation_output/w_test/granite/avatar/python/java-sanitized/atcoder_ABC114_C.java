import java.util.*;

public class atcoder_ABC114_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(aaa(N));
    }

    public static int aaa(int n) {
        if (n > N) {
            return 0;
        }
        int ans = 1;
        if (isPerfect(n)) {
            ans = 0;
        }
        for (char i : "753".toCharArray()) {
            ans += aaa(n + i - '0');
        }
        return ans;
    }

    public static boolean isPerfect(int n) {
        Set<Character> set = new HashSet<>();
        while (n > 0) {
            set.add((char) (n % 10 + '0'));
            n /= 10;
        }
        return set.contains('7') && set.contains('5') && set.contains('3');
    }
}