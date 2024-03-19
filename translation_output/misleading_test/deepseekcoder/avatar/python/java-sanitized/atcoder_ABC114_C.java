import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class atcoder_ABC114_C {
    static int N;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        System.out.println(aaa("0"));
    }

    static int aaa(String n) {
        if (Integer.parseInt(n) > N) {
            return 0;
        }
        int ans = 1;
        Set<Character> set = new HashSet<>();
        for (char c : n.toCharArray()) {
            set.add(c);
        }
        if (!set.contains('7') || !set.contains('5') || !set.contains('3')) {
            ans = 0;
        }
        for (char i : "753".toCharArray()) {
            ans += aaa(n + i);
        }
        return ans;
    }
}