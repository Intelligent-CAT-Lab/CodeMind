import java.util.*;

public class p01542 {
    static int[] dd = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
    static int[] ddn = {{-1, 0}, {-1, 1}, {0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}, {-1, -1}};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sysLimit = (int) Math.pow(10, 7);
        double inf = 1e20;
        double eps = 1e-13;
        int mod = 1e9 + 7;

        List<Integer> rr = new ArrayList<>();

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
                    int ri = s.indexOf(")");
                    if (ri + 1 < sa.length && (sa[