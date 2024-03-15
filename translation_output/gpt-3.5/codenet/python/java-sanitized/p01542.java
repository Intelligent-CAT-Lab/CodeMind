import java.io.*;
import java.util.*;

public class p01542 {
    static final int mod = (int)1e9+7;
    static final int inf = (int)1e20;
    
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);

        List<Integer> result = new ArrayList<>();

        while (true) {
            String n = sc.next();
            if (n.equals("0")) {
                break;
            }
            result.add(f(n));
        }

        for (int res : result) {
            out.println(res);
        }

        out.flush();
        out.close();
    }

    static int f(String s) {
        String ca = "01+-*()";
        String[] sa = s.split("\\.");
        int r = -1;
        int sl = sa.length;

        Map<String, Integer> fm = new HashMap<>();

        StringBuilder sb = new StringBuilder();

        for (char c : ca.toCharArray()) {
            sb.append(c);
        }

        for (char c : sb.toString().toCharArray()) {
            sa = s.split("\\" + c);
        }

        int[] seq = new int[sa.length-1];
        Arrays.fill(seq, 0);

        while (true) {
            String t = "";
            for (int i = 0; i < seq.length; i++) {
                t += sa[i];
                t += ca.charAt(seq[i]);
            }
            t += sa[sa.length-1];

            int tr = _f(t, fm);
            if (tr != -1) {
                tr = Integer.parseInt(tr, 2);
                if (tr >= 1024 || tr < 0) {
                    tr = -1;
                }
            }
            r = Math.max(r, tr);

            boolean hasNext = nextPermutation(seq);

            if (!hasNext) {
                break;
            }
        }

        return r;
    }

    static int _f(String s, Map<String, Integer> fm) {
        if (fm.containsKey(s)) {
            return fm.get(s);
        }

        if (s.contains(")")) {
            int ri = s.indexOf(')');
            // Check if there is a number immediately following the closing bracket
            if (s.length() > ri+1 && s.charAt(ri+1) >= '0' && s.charAt(ri+1) <= '1') {
                fm.put(s, -1);
                return -1;
            }

            int li = -1;
            for (int i = ri-1; i >= 0; i--) {
                if (s.charAt(i) == '(') {
                    li = i;
                    break;
                }
            }

            // Check if there is a number immediately before the opening bracket
            if (li < 0 || (li > 0 && s.charAt(li-1) >= '0' && s.charAt(li-1) <= '1')) {
                fm.put(s, -1);
                return -1;
            }

            String ts = s.substring(li+1, ri);

            if (!ts.contains("+") && !ts.contains("-") && !ts.contains("*")) {
                fm.put(s, -1);
                return -1;
            }

            int tr = _f(ts, fm);

            if (tr == -1) {
                fm.put(s, -1);
                return -1;
            }

            fm.put(s, _f(s.substring(0, li) + tr + s.substring(ri+1), fm));
            return fm.get(s);
        }

        if (s.contains("(")) {
            fm.put(s, -1);
            return -1;
        }

        int l = s.length();

        if (s.contains("*")) {
            int oi = s.indexOf('*');
            int li = oi;
            for (int i = oi-1; i >= 0; i--) {
                if (s.charAt(i) < '0' || s.charAt(i) > '1') {
                    break;
                }
                li = i;
            }

            int ri = oi;
            for (int i = oi+1; i < l; i++) {
                if (s.charAt(i) < '0' || s.charAt(i) > '1') {
                    break;
                }
                ri = i;
            }

            if (li == oi || ri == oi) {
                fm.put(s, -1);
                return -1;
            }

            int t = Integer.parseInt(s.substring(li, oi), 2);
            int u = Integer.parseInt(s.substring(oi+1, ri+1), 2);
            int tu = t * u;

            if (t < 0 || t >= 1024 || u < 0 || u >= 1024 || tu < 0 || tu >= 1024) {
                fm.put(s, -1);
                return -1;
            }

            String ts = Integer.toBinaryString(tu);
            fm.put(s, _f(s.substring(0, li) + ts + s.substring(ri+1), fm));
            return fm.get(s);
        }
        
        int pi = inf;
        int mi = inf;
        
        if (s.contains("+")) {
            pi = s.indexOf('+');
        }

        if (s.contains("-")) {
            mi = s.indexOf('-');
        }

        if (pi == inf && mi == inf) {
            int t = Integer.parseInt(s, 2);
            fm.put(s, s);
            if (t < 0 || t >= 1024) {
                fm.put(s, -1);
            }
            return fm.get(s);
        }

        int oi = Math.min(pi, mi);
        int li = oi;
        for (int i = oi-1; i >= 0; i--) {
            if (s.charAt(i) < '0' || s.charAt(i) > '1') {
                break;
            }
            li = i;
        }

        int ri = oi;
        for (int i = oi+1; i < l; i++) {
            if (s.charAt(i) < '0' || s.charAt(i) > '1') {
                break;
            }
            ri = i;
        }

        if (li == oi || ri == oi) {
            fm.put(s, -1);
            return -1;
        }

        int t = Integer.parseInt(s.substring(li, oi), 2);
        int u = Integer.parseInt(s.substring(oi+1, ri+1), 2);
        int tu = t + u;

        if (oi == mi) {
            tu = t - u;
        }

        if (t < 0 || t >= 1024 || u < 0 || u >= 1024 || tu < 0 || tu >= 1024) {
            fm.put(s, -1);
            return -1;
        }

        String ts = Integer.toBinaryString(tu);
        fm.put(s, _f(s.substring(0, li) + ts + s.substring(ri+1), fm));
        return fm.get(s);
    }

    static boolean nextPermutation(int[] nums) {
        int k = -1;
        int l = -1;

        // Step 1
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                k = i;
                break;
            }
        }

        if (k == -1) {
            Arrays.sort(nums);
            return false;
        }

        // Step 2
        for (int i = nums.length - 1; i > k; i--) {
            if (nums[i] > nums[k]) {
                l = i;
                break;
            }
        }

        // Step 3
        int temp = nums[k];
        nums[k] = nums[l];
        nums[l] = temp;

        // Step 4
        for (int i = k + 1, j = nums.length - 1; i < j; i++, j--) {
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        return true;
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}