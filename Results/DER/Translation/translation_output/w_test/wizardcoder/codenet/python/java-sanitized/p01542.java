import java.util.*;

public class p01542 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> res = new ArrayList<>();
        while (sc.hasNext()) {
            String s = sc.next();
            if (s.equals("0")) {
                break;
            }
            int r = solve(s);
            res.add(r);
        }
        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
        }
    }

    public static int solve(String s) {
        int r = -1;
        Set<String> seen = new HashSet<>();
        Queue<String> q = new LinkedList<>();
        q.offer(s);
        while (!q.isEmpty()) {
            String curr = q.poll();
            if (seen.contains(curr)) {
                continue;
            }
            seen.add(curr);
            if (curr.equals("0")) {
                r = 0;
                break;
            }
            int len = curr.length();
            for (int i = 0; i < len; i++) {
                if (curr.charAt(i) == '(') {
                    int j = curr.indexOf(')', i);
                    if (j == -1) {
                        continue;
                    }
                    if (j > i + 1 && curr.charAt(i + 1) == '0') {
                        continue;
                    }
                    String sub = curr.substring(i + 1, j);
                    if (sub.contains("+") || sub.contains("-") || sub.contains("*")) {
                        q.offer(curr.substring(0, i) + solve(sub) + curr.substring(j + 1));
                    }
                }
            }
        }
        return r;
    }
}