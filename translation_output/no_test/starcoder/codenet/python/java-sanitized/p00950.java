import java.util.*;
import java.io.*;

public class p00950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int l = s.length();
        char[] base = "=+-*()01".toCharArray();
        int[] mapping = new int[26];
        int[] counter = new int[26];
        int cnt = 0;
        for (char c : s.toCharArray()) {
            if (c >= '0' && c <= '9') continue;
            if (c >= 'a' && c <= 'z') c -= 'a';
            if (c >= 'A' && c <= 'Z') c -= 'A';
            if (c < 0 || c >= base.length || base[c]!= c) {
                mapping[c] = cnt;
                cnt++;
            }
        }
        if (cnt > 8) {
            System.out.println(0);
            return;
        }
        int ans = 0;
        for (int[] b : new Permutations(base, cnt)) {
            int cur = 0;
            boolean failed = false;
            int lv = 0, rv = 0;
            while (cur < l) {
                char c = s.charAt(cur);
                if (c >= '0' && c <= '9') {
                    int v = c - '0';
                    lv = (lv << 1) ^ v;
                } else if (c >= 'a' && c <= 'z') {
                    int v = c - 'a';
                    lv = (lv << 1) ^ b[mapping[v]];
                } else if (c >= 'A' && c <= 'Z') {
                    int v = c - 'A';
                    lv = (lv << 1) ^ b[mapping[v]];
                } else if (c == '=') {
                    cur++;
                    break;
                } else if (c == '+') {
                    cur++;
                    lv += rv;
                    rv = 0;
                } else if (c == '-') {
                    cur++;
                    lv -= rv;
                    rv = 0;
                } else if (c == '*') {
                    cur++;
                    lv *= rv;
                    rv = 0;
                } else if (c == '(') {
                    cur++;
                    rv = lv;
                    lv = 0;
                    while (cur < l) {
                        c = s.charAt(cur);
                        if (c == ')') {
                            cur++;
                            break;
                        }
                        if (c >= '0' && c <= '9') {
                            int v = c - '0';
                            lv = (lv << 1) ^ v;
                        } else if (c >= 'a' && c <= 'z') {
                            int v = c - 'a';
                            lv = (lv << 1) ^ b[mapping[v]];
                        } else if (c >= 'A' && c <= 'Z') {
                            int v = c - 'A';
                            lv = (lv << 1) ^ b[mapping[v]];
                        } else {
                            failed = true;
                            break;
                        }
                        cur++;
                    }
                    if (failed) break;
                } else {
                    failed = true;
                    break;
                }
            }
            if (!failed && cur == l) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}

class Permutations {
    char[] base;
    int cnt;
    int[] mapping;
    int[] counter;
    int[] b;
    int[] cur;
    boolean failed;
    int lv, rv;
    int l;
    char[] s;
    public Permutations(char[] base, int cnt) {
        this.base = base;
        this.cnt = cnt;
        this.mapping = new int[26];
        this.counter = new int[26];
        this.cnt = 0;
        for (char c : base) {
            if (c >= 'a' && c <= 'z') c -= 'a';
            if (c >= 'A' && c <= 'Z') c -= 'A';
            if (c < 0 || c >= base.length || base[c]!= c) {
                mapping[c] = cnt;
                cnt++;
            }
        }
        this.b = new int[cnt];
        this.cur = new int[cnt];
        this.failed = false;
        this.lv = 0;
        this.rv = 0;
        this.l = 0;
        this.s = new char[100000];
    }
    public Iterator<int[]> iterator() {
        return new Iterator<int[]>() {
            public boolean hasNext() {
                return next();
            }
            public int[] next() {
                if (failed) return null;
                if (l == 0) {
                    for (int i = 0; i < cnt; i++) {
                        b[i] = i;
                        cur[i] = 0;
                    }
                    l = 1;
                } else {
                    int i = cnt - 1;
                    while (i >= 0) {
                        if (cur[i] < i) {
                            cur[i]++;
                            for (int j = 0; j < i; j++) {
                                cur[j] = b[j];
                            }
                            cur[i] = b[i] = i;
                            l = 1;
                            break;
                        }
                        i--;
                    }
                    if (i < 0) {
                        failed = true;
                        return null;
                    }
                }
                for (int i = 0; i < cnt; i++) {
                    s[i] = base[b[i]];
                }
                int[] res = new int[cnt];
                for (int i = 0; i < cnt; i++) {
                    res[i] = b[i];
                }
                return res;
            }
        };
    }
}