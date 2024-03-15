```java
import java.io.*;
import java.util.*;

public class Main {

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream in) {
            br = new BufferedReader(new InputStreamReader(in));
            st = new StringTokenizer("");
        }

        String next() throws IOException {
            while (!st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        String nextLine() throws IOException {
            return br.readLine();
        }
    }

    static int inf = (int) 1e20;
    static double eps = 1.0 / 1e13;
    static int mod = (int) 1e9 + 7;
    static int[][] dd = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
    static int[][] ddn = {{-1, 0}, {-1, 1}, {0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}, {-1, -1}};

    public static void main(String[] args) throws IOException {
        FastScanner sc = new FastScanner(System.in);
        String s = sc.nextLine();
        Map<List<Object>, List<Integer>> fm = new HashMap<>();

        List<Object> a = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                int ci = Character.getNumericValue(c);
                if (!a.isEmpty() && a.get(a.size() - 1) instanceof Integer) {
                    a.set(a.size() - 1, (int) a.get(a.size() - 1) * 10 + ci);
                } else {
                    a.add(ci);
                }
            } else {
                a.add(c);
            }
        }

        List<Integer> fResult = f(a, fm);
        System.out.println(fResult.get(1));
    }

    static List<Integer> f(List<Object> a, Map<List<Object>, List<Integer>> fm) {
        List<Object> key = new ArrayList<>(a);
        if (fm.containsKey(key)) {
            return fm.get(key);
        }
        
        if (a.size() == 2) {
            List<Integer> result = new ArrayList<>(2);
            result.add(inf);
            result.add(-inf);
            fm.put(key, result);
            return result;
        }

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) instanceof Integer) {
                continue;
            } else {
                if (i > 0) {
                    a = a.subList(i, a.size());
                }
                break;
            }
        }

        for (int i = a.size() - 1; i >= 0; i--) {
            if (a.get(i) instanceof Integer) {
                continue;
            } else {
                a = a.subList(0, i + 1);
                break;
            }
        }

        if (a.size() == 1) {
            List<Integer> result = new ArrayList<>(2);
            result.add((int) a.get(0));
            result.add((int) a.get(0));
            fm.put(key, result);
            return result;
        }

        List<Integer> ri = new ArrayList<>();
        List<Integer> ra = new ArrayList<>();
        ri.add(inf);
        ra.add(-inf);
        int l = a.size();
        for (int i = 1; i < a.size() - 1; i++) {
            if (!(a.get(i) instanceof Character) || (i > 1 && a.get(i - 2) instanceof Character && ((char) a.get(i - 2)) == '(') || (i + 2 < l && a.get(i + 2) instanceof Character && ((char) a.get(i + 2)) == ')')) {
                continue;
            }
            List<Integer> fl = f(a.subList(0, i), fm);
            List<Integer> fr = f(a.subList(i + 1, a.size()), fm);
            if (((char) a.get(i)) == '+') {
                ri.add(fl.get(0) + fr.get(0));
                ra.add(fl.get(1) + fr.get(1));
            } else {
                ri.add(fl.get(0) - fr.get(1));
                ra.add(fl.get(1) - fr.get(0));
            }
        }

        List<Integer> result = new ArrayList<>(2);
        result.add(Collections.min(ri));
        result.add(Collections.max(ra));
        fm.put(key, result);
        return result;
    }
}
```
