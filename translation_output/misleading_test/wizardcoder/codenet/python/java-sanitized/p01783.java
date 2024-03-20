import java.util.*;

public class p01783 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        Map<String, Integer> memo = new HashMap<>();
        memo.put("", -1);
        int res = helper(s, memo);
        System.out.println(res);
    }

    public static int helper(String s, Map<String, Integer> memo) {
        if (memo.containsKey(s)) {
            return memo.get(s);
        }
        int n = s.length();
        int res = -1;
        if (n > 5 && s.charAt(1) == '(' && s.charAt(n-1) == ')') {
            if (s.charAt(0) == 'R') {
                for (int i = 3; i < n-2; i++) {
                    if (s.charAt(i)!= ',') {
                        continue;
                    }
                    int tl = helper(s.substring(2, i), memo);
                    int tr = helper(s.substring(i+1, n-1), memo);
                    if (tl >= 0 && tr >= 0 && res < tr) {
                        res = tr;
                    }
                }
            } else if (s.charAt(0) == 'L') {
                for (int i = 3; i < n-2; i++) {
                    if (s.charAt(i)!= ',') {
                        continue;
                    }
                    int tl = helper(s.substring(2, i), memo);
                    int tr = helper(s.substring(i+1, n-1), memo);
                    if (tl >= 0 && tr >= 0 && res < tl) {
                        res = tl;
                    }
                }
            }
        }
        boolean valid = true;
        for (char c : s.toCharArray()) {
            if (c == '?' || c == '0' && s.charAt(0)!= '0') {
                valid = false;
                break;
            }
        }
        if (valid) {
            res = Integer.parseInt(s.replace('?', '9'));
        }
        memo.put(s, res);
        return res;
    }
}