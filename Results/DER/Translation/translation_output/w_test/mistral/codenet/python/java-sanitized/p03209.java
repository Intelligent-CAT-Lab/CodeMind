import java.util.*;

public class p03209 {
    final static int INF = (int) 1e18;
    final static int MOD = (int) 1e9 + 7;
    final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N, X;
        Scanner sc = new Scanner(System.in);
        List<Integer> l = new ArrayList<>(Arrays.asList(0, 1));
        List<Integer> p = new ArrayList<>(Arrays.asList(0, 1));
        for (int i = 1; i < 51; i++) {
            l.add(l.get(i - 1) * 2 + 3);
            p.add(p.get(i - 1) * 2 + 1);
        }
        int ans = 0;
        for (int i = N; i >= 0; i--) {
            if (i == 0 && X >= 1) {
                ans++;
                break;
            }
            if (X <= 1) {
                break;
            } else if (X <= l.get(i - 1) + 1) {
                X--;
                continue;
            } else if (X == l.get(i - 1) + 2) {
                ans++;
                X -= 2;
            } else {
                ans += p.get(i - 1) + 1;
                X -= l.get(i - 1) + 2;
            }
        }
        System.out.println(ans);
    }
}