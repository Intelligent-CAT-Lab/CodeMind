import java.io.*;
import java.util.*;

public class p03482 {
    public static void main(String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = buffer.readLine();
        int n = s.length();
        int ans = n;
        int ans2 = n;
        for (int pos = 0; pos < n; pos++) {
            if (s.charAt(pos) == '1') {
                ans = Math.min(ans, Math.max(pos, n - pos - 1));
            } else {
                ans2 = Math.min(ans2, Math.max(pos, n - pos - 1));
            }
        }
        System.out.println(Math.max(ans, ans2));
    }
}