```java
import java.io.*;
import java.util.*;

public class Main {
    static int inf = (int) Math.pow(10, 20);
    static double eps = 1.0 / Math.pow(10, 10);
    static int mod = (int) (Math.pow(10, 9) + 7);
    static int[][] dd = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
    static int[][] ddn = {{-1, 0}, {-1, 1}, {0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}, {-1, -1}};
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static List<Integer> LI() throws IOException {
        st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();
        while (st.hasMoreTokens()) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        return list;
    }

    static List<Integer> LI_() throws IOException {
        st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();
        while (st.hasMoreTokens()) {
            list.add(Integer.parseInt(st.nextToken()) - 1);
        }
        return list;
    }

    static List<Double> LF() throws IOException {
        st = new StringTokenizer(br.readLine());
        List<Double> list = new ArrayList<>();
        while (st.hasMoreTokens()) {
            list.add(Double.parseDouble(st.nextToken()));
        }
        return list;
    }

    static List<String> LS() throws IOException {
        st = new StringTokenizer(br.readLine());
        List<String> list = new ArrayList<>();
        while (st.hasMoreTokens()) {
            list.add(st.nextToken());
        }
        return list;
    }

    static int I() throws IOException {
        return Integer.parseInt(br.readLine());
    }

    static double F() throws IOException {
        return Double.parseDouble(br.readLine());
    }

    static String S() throws IOException {
        return br.readLine();
    }

    static void pf(String s) {
        System.out.println(s);
        System.out.flush();
    }

    public static void main(String[] args) throws IOException {
        List<Integer> rr = new ArrayList<>();
        
        Function<String, Integer> f = n -> {
            int r = 0, t = 0;
            for (char c : n.toCharArray()) {
                if (c == 'R') {
                    t++;
                    if (t == 4) {
                        r++;
                        t = 0;
                    }
                } else {
                    t--;
                    if (t == -4) {
                        t = 0;
                    }
                }
            }
            return r;
        };

        while (true) {
            String n = S();
            if (n.equals("0")) {
                break;
            }
            rr.add(f.apply(n));
        }

        for (int ans : rr) {
            System.out.println(ans);
        }
    }
}
```
