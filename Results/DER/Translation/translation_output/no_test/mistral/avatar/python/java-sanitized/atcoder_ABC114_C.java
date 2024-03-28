import java.util.*;

public class atcoder_ABC114_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ans = aaa(0);
        System.out.println(ans);
    }

    public static int aaa(int n) {
        if (n > N) {
            return 0;
        }
        Set<String> set = new HashSet<>();
        set.add(Integer.toString(n));
        if (set.contains("7") && set.contains("5") && set.contains("3")) {
            return 1;
        }
        int ans = 0;
        for (char c : "753".toCharArray()) {
            ans += aaa(n + c - '0');
        }
        return ans;
    }
}