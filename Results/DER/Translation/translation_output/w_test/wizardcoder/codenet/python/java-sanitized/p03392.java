import java.util.*;
import java.io.*;

public class p03392 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine().trim();
        int l = a.length();
        if (l < 6) {
            Set<String> s = new HashSet<>();
            s.add(a);
            Queue<String> q = new LinkedList<>();
            q.offer(a);
            int oa = (int)'a';
            while (!q.isEmpty()) {
                String t = q.poll();
                for (int i = 0; i < l - 1; i++) {
                    if (t.charAt(i)!= t.charAt(i+1)) {
                        char c = (char)(oa + 3 - (t.charAt(i) - oa) - (t.charAt(i+1) - oa));
                        String na = t.substring(0, i) + c + c + t.substring(i+2);
                        if (!s.contains(na)) {
                            s.add(na);
                            q.offer(na);
                        }
                    }
                }
            }
            System.out.println(s.size());
            return;
        }
        String t = a.replaceAll(".", a.charAt(0));
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
        if (a.matches(".*(.).*\\