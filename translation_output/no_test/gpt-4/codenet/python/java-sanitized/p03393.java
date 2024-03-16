import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.math.BigInteger;
import java.util.Set;
import java.util.TreeSet;

public class p03393 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static final int INF = Integer.MAX_VALUE;
    static final long MOD = (long)1e9 + 7;

    public static void main(String[] args) throws IOException {
        String s = next();
        if (s.length() < 26) {
            for (int i = 0; i < 26; i++) {
                char tmp = (char) (i + 'a');
                if (!s.contains(tmp + "")) {
                    System.out.println(s + tmp);
                    return; // instead of exit() in Python, use return to exit the program
                }
            }
        } else {
            for (int i = 25; i >= 0; i--) {
                for (char j = (char) (s.charAt(i) + 1); j <= 'z'; j++) {
                    if (!s.substring(0, i).contains(j + "")) {
                        System.out.println(s.substring(0, i) + j);
                        return; // instead of exit() in Python, use return to exit the program
                    }
                }
            }
            System.out.println(-1);
            return; // instead of exit() in Python, use return to exit the program
        }
    }
    
    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine().trim());
        }
        return st.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    // Other functions for MAP, S_MAP, LIST, S_LIST can be implemented similarly.
}