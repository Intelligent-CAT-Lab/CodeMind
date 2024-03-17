import java.util.*;

public class atcoder_ABC114_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        int ans = aaa(N, "0");
        System.out.println(ans);
    }

    public static int aaa(int N, String n) {
        if (Integer.parseInt(n) > N) {
            return 0;
        }
        int ans = 1;
        Set<Character> set = new HashSet<>();
        for (char c : n.toCharArray()) {
            set.add(c);
        }
        if (set.size() == 3 && set.contains('7') && set.contains('5') && set.contains('3')) {
            ans = 1;
        } else {
            ans = 0;
        }
        for (char c : "753".toCharArray()) {
            ans += aaa(N, n + c);
        }
        return ans;
    }
}