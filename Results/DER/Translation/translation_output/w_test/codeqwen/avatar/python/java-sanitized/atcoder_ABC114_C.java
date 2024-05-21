import java.util.HashSet;
import java.util.Set;

public class atcoder_ABC114_C {
    public static void main(String[] args) {
        int N = Integer.parseInt(System.console().readLine());
        System.out.println(aaa(0, N));
    }

    public static int aaa(int n, int N) {
        if (n > N) {
            return 0;
        }
        Set<Character> set = new HashSet<>();
        for (char c : String.valueOf(n).toCharArray()) {
            set.add(c);
        }
        boolean isValid = set.contains('7') && set.contains('5') && set.contains('3');
        int ans = isValid ? 1 : 0;
        for (char i : new char[]{'7', '5', '3'}) {
            ans += aaa(n + i - '0', N);
        }
        return ans;
    }
}