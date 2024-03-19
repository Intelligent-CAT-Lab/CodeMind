import java.util.*;

public class p01542 {
    static int[] dd = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
    static int[] ddn = {{-1, 0}, {-1, 1}, {0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}, {-1, -1}};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] rr = new int[1];

        public static int f(String s) {
            String ca = "01+-*()";
            String[] sa = s.split(".");
            int r = -1;
            int sl = sa.length;

            Map<String, Integer> fm = new HashMap<>();
            public static int _f(String s) {
                if (s.equals("")) {
                    return 0;
                }
                if (s.equals("(")) {
                    return -1;
                }
                if (s.equals(")")) {
                    return -1;
                }
                int l = s.length();
                if (s.charAt(l - 1) == '*') {
                    int oi = s.indexOf('*');
                    int