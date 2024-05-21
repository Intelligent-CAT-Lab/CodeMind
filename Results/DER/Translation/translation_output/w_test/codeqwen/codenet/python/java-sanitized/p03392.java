import java.util.*;
import java.lang.*;

public class p03392 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine().trim();
        int l = a.length();
        if (l < 6) {
            Set<String> s = new HashSet<>();
            s.add(a);
            Queue<String> q = new LinkedList<>();
            q.add(a);
            int oa = (int) 'a';
            while (!q.isEmpty()) {
                a = q.poll();
                for (int i = 0; i < l - 1; i++) {
                    if (a.charAt(i) != a.charAt(i + 1)) {
                        char t = (char) (oa + 3 - (a.charAt(i) - oa) - (a.charAt(i + 1) - oa));
                        String na = a.substring(0, i) + t + t + a.substring(i + 2);
                        if (!s.contains(na)) {
                            s.add(na);
                            q.add(na);
                        }
                    }
                }
            }
            System.out.println(s.size());
            return;
        }
        String t = a.charAt(0) + a.substring(0, l);
        if (t.equals(a)) {
            System.out.println(1);
            return;
        }
        int x = 0;
        for (char c : a.toCharArray()) {
            if (c == 'b') {
                x += 1;
            } else if (c == 'c') {
                x += 2;
            }
        }
        int ans = 0;
        if (all(a, l - 1)) {
            ans += 1;
        }
        int mod = 998244353;
        int[] d