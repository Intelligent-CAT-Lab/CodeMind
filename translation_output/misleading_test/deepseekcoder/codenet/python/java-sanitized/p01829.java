import java.util.*;

public class p01829 {
    static int inf = (int)1e20;
    static int mod = (int)1e9+7;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {-1, 0, 1, 0};

    static String solve(String s) {
        int l = s.length();
        int n = Integer.parseInt(s);
        int m = inf;
        String r = "";
        int t = (int)Math.pow(10, l);
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 10; i++) nums.add(i);
        Collections.shuffle(nums);
        do {
            StringBuilder sb = new StringBuilder();
            for (int num : nums) {
                sb.append(num);
            }
            int b = Integer.parseInt(sb.toString());
            int tm = Math.max(Math.abs(n-b), t-Math.abs(n-b));
            if (m > tm) {
                m = tm;
                r = sb.toString();
            }
        } while (nextPermutation(nums));
        return r;
    }

    static boolean nextPermutation(List<Integer> a) {
        int n = a.size();
        int i = n - 2;
        while (i >= 0 && a.get(i) >= a.get(i+1)) i--;
        if (i < 0) return false;
        int j = n - 1;
        while (j > i && a.get(j) <= a.get(i)) j--;
        Collections.swap(a, i, j);
        Collections.reverse(a.subList(i+1, n));
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(solve(s));
    }
}