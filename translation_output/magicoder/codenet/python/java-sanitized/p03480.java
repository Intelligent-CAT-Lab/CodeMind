import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = s.length();
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                res = Math.min(res, Math.max(n - i - 1, i + 1));
            }
        }
        if (res == Integer.MAX_VALUE) {
            System.out.println(n);
        } else {
            System.out.println(res);
        }
    }
}