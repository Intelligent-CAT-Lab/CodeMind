import java.util.*;
import java.io.*;

public class p01883 {
    static int[] dd = {-1, 0, 1, 0};
    static int[] ddn = {-1, 0, -1, 1, 0, 1, 1, 1, 1, 0, 1, -1, 0, -1, -1, -1};

    static ArrayList<Integer> LI() {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        for (String s : input) {
            arr.add(Integer.parseInt(s));
        }
        return arr;
    }

    static ArrayList<Integer> LI_() {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        for (String s : input) {
            arr.add(Integer.parseInt(s) - 1);
        }
        return arr;
    }

    static ArrayList<Double> LF() {
        ArrayList<Double> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        for (String s : input) {
            arr.add(Double.parseDouble(s));
        }
        return arr;
    }

    static ArrayList<String> LS() {
        ArrayList<String> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        Collections.addAll(arr, input);
        return arr;
    }

    static int I() {
        Scanner sc = new Scanner(System.in);
        return Integer.parseInt(sc.nextLine());
    }

    static double F() {
        Scanner sc = new Scanner(System.in);
        return Double.parseDouble(sc.nextLine());
    }

    static String S() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    static void pf(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        int n = I();
        ArrayList<Integer> a = new ArrayList<>();
        a.add(0);
        for (int i = 1; i < 50000; i++) {
            a.add(a.get(i - 1) + i);
        }

        int t = Collections.binarySearch(a, n);
        t = (t >= 0) ? t : -t - 1;

        List<Integer> r = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            r.add(1);
        }
        for (int i = 0; i < t; i++) {
            r.add(0);
        }

        for (int i = 0; i < t; i++) {
            int ai = a.get(t - i);
            int ti = t + i;
            if (n < ai) {
                int ts = Math.min(t, ai - n);
                r.set(ti, 0);
                r.set(ti - ts, 1);
                n -= t - ts;
            } else {
                break;
            }
        }

        StringBuilder result = new StringBuilder();
        for (int val : r) {
            result.append(val == 1 ? '(' : ')');
        }

        System.out.println(result.toString());
    }
}