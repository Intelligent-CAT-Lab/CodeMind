import java.util.*;

public class p02667 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t = sc.nextLine();
        System.out.println(solve(t));
    }

    public static long solve(String t) {
        long res = 0;
        int length = 0;
        int n = t.length();
        int[] used = new int[n];
        // insert 1 greedy
        for (int i = 0; i < n; i++) {
            if (t.charAt(i) == '1') {
                length += 1;
                res += (length + 1) / 2;
                used[i] = 1;
            }
        }
        // insert 0 greedy
        int cntTemp = 0;
        for (int i = 0; i < n; i++) {
            if (used[i] == 1) {
                cntTemp += 1;
            } else if (cntTemp % 2 == 1) {
                // add 0 if it is 2, 4, 6 th
                cntTemp += 1;
                length += 1;
                res += (length + 1) / 2;
                used[i] = 1;
            }
        }
        int cntUnused = n - Arrays.stream(used).sum();
        int switchCount = 0;
        // split by other 0
        int st = 0;
        int cnt1Even = 0;
        int cnt1Odd = 0;
        for (int i = 0; i < n; i++) {
            if (used[i] == 0) {
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