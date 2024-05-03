import java.util.*;
import java.lang.*;

class Main {
    static int inf = (int) 1e20;
    static double eps = 1e-13;
    static int mod = (int) 1e9 + 7;
    static int[][] dd = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
    static int[][] ddn = {{-1, 0}, {-1, 1}, {0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}, {-1, -1}};

    static Scanner sc = new Scanner(System.in);

    static int[] LI() {
        return Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    }

    static int[] LI_() {
        return Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).map(x -> x - 1).toArray();
    }

    static double[] LF() {
        return Arrays.stream(sc.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
    }

    static String[] LS() {
        return sc.nextLine().split(" ");
    }

    static int I() {
        return sc.nextInt();
    }

    static double F() {
        return sc.nextDouble();
    }

    static String S() {
        return sc.next();
    }

    static void pf(String s) {
        System.out.println(s);
    }

    static int f(String s) {
        char[] ca = {'0', '1', '+', '-', '*', '(', ')'};
        String[] sa = s.split("\\.");
        int r = -1;
        int sl = sa.length;

        Map<String, Integer> fm = new HashMap<>();

        int _f(String s) {
            if (fm.containsKey