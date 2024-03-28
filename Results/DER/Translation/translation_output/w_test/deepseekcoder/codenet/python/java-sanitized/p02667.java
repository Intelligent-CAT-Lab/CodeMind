import java.util.*;

public class p02667 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String t = scanner.next();
        System.out.println(solve(t));
    }

    public static int solve(String t) {
        int res = 0;
        int length = 0;
        int n = t.length();
        boolean[] used = new boolean[n];
        // insert 1 greedy
        for (int i = 0; i < n; i++) {
            if (t.charAt(i) == '1') {
                length += 1;
                res += (length + 1) / 2;
                used[i] = true;
            }
        }

        // insert 0 greedy
        int cntTemp = 0;
        for (int i = 0; i < n; i++) {
            if (used[i]) {
                cntTemp += 1;
            } else if (cntTemp % 2 == 1) {
                // add 0 if it is 2, 4, 6 th
                cntTemp += 1;
                length += 1;
                res += (length + 1) / 2;
                used[i] = true;
            }
        }

        int cntUnused = 0;
        for (boolean b : used) {
            if (!b) {
                cntUnused += 1;
            }
        }
        int switchCount = 0;
        int cnt1Even = 0;
        int cnt1Odd = 0;
        int st = 0;
        // split by other 0
        for (int i = 0; i < n; i++) {
            if (!used[i]) {
                int switched = (switchCount + 1) / 2;
                int nonSwitched = cntUnused - switched;
                res += cnt1Even * nonSwitched + cnt1Odd * switched;
                st = i + 1;
                switchCount += 1;
                cnt1Even = 0;
                cnt1Odd = 0;
            }
            if (t.charAt(i) == '1') {
                if ((i - st) % 2 == 0) {
                    cnt1Even += 1;
                } else {
                    cnt1Odd += 1;
                }
            }
        }

        // add last
        int switched = (switchCount + 1) / 2;
        int nonSwitched = cntUnused - switched;
        res += cnt1Even * nonSwitched + cnt1Odd * switched;

        return res;
    }
}