```java
import java.util.*;
import java.io.*;

public class Main {
    static int inf = (int)1e20;
    static double eps = 1.0 / Math.pow(10, 10);
    static int mod = 998244353;
    static int[][] dd = {{0,-1}, {1,0}, {0,1}, {-1,0}};
    static int[][] ddn = {{0,-1}, {1,-1}, {1,0}, {1,1}, {0,1}, {-1,-1}, {-1,0}, {-1,1}};

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    static String[] LS() throws IOException {
        return br.readLine().split(" ");
    }

    static int I() throws IOException {
        return Integer.parseInt(br.readLine());
    }

    static String S() throws IOException {
        return br.readLine();
    }

    public static void main(String[] args) throws IOException {
        String s = S();
        int l = s.length();
        int n = Integer.parseInt(s);
        int m = inf;
        String r = "";
        long t = (long)Math.pow(10, l);

        for (List<Integer> a : permutations(Arrays.asList(0,1,2,3,4,5,6,7,8,9), l)) {
            int b = 0;
            for (int c : a) {
                b = b * 10 + c;
            }
            long tm = Math.max(Math.abs(n-b), t-Math.abs(n-b));
            if (m > tm) {
                m = (int)tm;
                r = String.join("", a);
            }
        }

        out.println(r);
        out.close();
    }

    static <T> List<List<T>> permutations(List<T> arr, int k) {
        List<List<T>> res = new ArrayList<>();
        backtrack(res, new ArrayList<>(), arr, k);
        return res;
    }

    static <T> void backtrack(List<List<T>> res, List<T> tempList, List<T> arr, int k) {
        if (tempList.size() == k) {
            res.add(new ArrayList<>(tempList));
        } else {
            for (int i = 0; i < arr.size(); i++) {
                if (tempList.contains(arr.get(i))) {
                    continue;
                }
                tempList.add(arr.get(i));
                backtrack(res, tempList, arr, k);
                tempList.remove(tempList.size() - 1);
            }
        }
    }
}
```
