import java.util.Scanner;

public class p01813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[][] fm = new int[s.length()][s.length()];
        int[] a = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                a[i] = s.charAt(i) - '0';
            } else {
                a[i] = s.charAt(i);
            }
        }
        int[][] f = new int[s.length()][s.length()];
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                f[i][j] = -1;
            }
        }
        int[] r = new int[2];
        r[0] = Integer.MAX_VALUE;
        r[1] = Integer.MIN_VALUE;
        for (int i = 0; i < s.length(); i++) {
            if (a[i] != '(') {
                if (i > 0 && a[i - 1] == '(') {
                    continue;
                }
                break;
            }
        }
        for (int i = s.length() - 1; i >= 0; i--) {
            if (a[i] != ')') {
                if (i < s.length() - 1 && a[i + 1] == ')') {
                    continue;
                }
                break;
            }
        }
        if (s.length() == 1) {
            r[0] = a[0];
            r[1] = a[0];
            return r;
        }
        for (int i = 1; i < s.length() - 1; i++) {
            if (!Character.isDigit(s.charAt(i)) || (i > 1 && a[i - 2] == '(') || (i + 2 < s.length() && a[i + 2] == ')')) {
                continue;
            }
            int[] fl = f(a, i);
            int[] fr = f(a, i + 1);
            if (s.charAt(i) == '+') {
                r[0] = Math.min(r[0], fl[0] + fr[0]);
                r[1] = Math.max(r[1], fl[1] + fr[1]);
            } else {
                r[0] = Math.min(r[0], fl[0] - fr[1]);
                r[1] = Math.max(r[1], fl[1] - fr[0]);
            }
        }
        return r;
    }

    public static int[] f(int[] a, int i) {
        int[][] fm = new int[a.length][a.length];
        for (int j = 0; j < a.length; j++) {
            for (int k = 0; k < a.length; k++) {
                fm[j][k] = -1;
            }
        }
        int[] r = new int[2];
        r[0] = Integer.MAX_VALUE;
        r[1] = Integer.MIN_VALUE;
        for (int j = 0; j < a.length; j++) {
            if (a[j] != '(') {
                if (j > 0 && a[j - 1] == '(') {
                    continue;
                }
                break;
            }
        }
        for (int j = a.length - 1; j >= 0; j--) {
            if (a[j] != ')') {
                if (j < a.length - 1 && a[j + 1] == ')') {
                    continue;
                }
                break;
            }
        }
        if (a.length == 1) {
            r[0] = a[0];
            r[1] = a[0];
            return r;
        }
        for (int j = 1; j < a.length - 1; j++) {
            if (!Character.isDigit(a[j]) || (j > 1 && a[j - 2] == '(') || (j + 2 < a.length && a[j + 2]