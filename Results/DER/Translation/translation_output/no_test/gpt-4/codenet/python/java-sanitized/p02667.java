import java.util.Scanner;

public class p02667 {
    
    public static int solve(String t) {
        int res = 0;
        int length = 0;
        int n = t.length();
        int[] used = new int[n];
        // insert 1 greedy
        for (int i = 0; i < n; i++) {
            if (t.charAt(i) == '1') {
                length++;
                res += (length + 1) / 2;
                used[i] = 1;
            }
        }
        
        // insert 0 greedy
        int cntTemp = 0;
        for (int i = 0; i < n; i++) {
            if (used[i] != 0) {
                cntTemp++;
            } else if (cntTemp % 2 == 1) {
                // add 0 if it is 2, 4, 6th
                cntTemp++;
                length++;
                res += (length + 1) / 2;
                used[i] = 1;
            }
        }
        
        int cntUnused = n - sum(used);
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
                switchCount++;
                cnt1Even = 0;
                cnt1Odd = 0;
            }
            if (t.charAt(i) == '1') {
                if ((i - st) % 2 == 0) {
                    cnt1Even++;
                } else {
                    cnt1Odd++;
                }
            }
        }
        
        // add last
        int switched = (switchCount + 1) / 2;
        int nonSwitched = cntUnused - switched;
        res += cnt1Even * nonSwitched + cnt1Odd * switched;
        
        return res;
    }

    private static int sum(int[] arr) {
        int total = 0;
        for (int j : arr) {
            total += j;
        }
        return total;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t = sc.next();
        int res = solve(t);
        System.out.println(res);
        sc.close();
    }
    
    // It's not standard to have a test function in production Java code,
    // but we can create one for testing purposes here.
    public static void test() {
        assert solve("1101") == 5;
        assert solve("0111101101") == 26;
    }
}