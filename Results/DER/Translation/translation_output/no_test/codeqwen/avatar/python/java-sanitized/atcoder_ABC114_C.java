import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class atcoder_ABC114_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(aaa(0, N));
    }

    public static int aaa(int n, int N) {
        if (n > N) {
            return 0;
        }
        Set<Character> set = new HashSet<>();
        while (n > 0) {
            set.add((char) ('0' + n % 10));
            n /= 10;
        }
        boolean is753 = set.contains('7') && set.contains('5') && set.contains('3');
        int ans = is753 ? 1 : 0;
        for (char i : "753".toCharArray()) {
            ans += aaa(n * 10 + i - '0', N);
        }
        return ans;
    }
}