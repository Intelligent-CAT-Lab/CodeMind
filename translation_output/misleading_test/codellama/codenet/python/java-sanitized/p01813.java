import java.util.Scanner;

public class p01813 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int[][] fm = new int[input.length()][input.length()];
        int[] a = new int[input.length()];
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) >= '0' && input.charAt(i) <= '9') {
                a[i] = input.charAt(i) - '0';
            } else {
                a[i] = input.charAt(i);
            }
        }
        int[][] f = new int[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            if (a[i] != '(') {
                if (i > 0 && a[i - 1] == '(') {
                    a = a.substring(i);
                    break;
                }
            }
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] != ')') {
                    a = a.substring(0, j + 1);
                    break;
                }
            }
            if (a.length == 1) {
                f[i] = new int[] { a[i], a[i] };
                continue;
            }
            int[] ri = new int[a.length - 1];
            int[] ra = new int[a.length - 1];
            for (int j = 1; j < a.length - 1; j++) {
                if (a[j] != '+' && a[j] != '-') {
                    continue;
                }
                int[] fl = f(a.substring(0, j));
                int[] fr = f(a.substring(j + 1));
                if (a[j] == '+') {
                    ri[j] = fl[0] + fr[0];
                    ra[j] = fl[1] + fr[1];
                } else {
                    ri[j] = fl[0] - fr[1];
                    ra[j] = fl[1] - fr[0];
                }
            }
            f[i] = new int[] { Math.min(ri), Math.max(ra) };
        }
        int[] r = f(a);
        System.out.println(r[1]);
    }

    public static int[] f(String a) {
        int[][] fm = new int[a.length()][a.length()];
        int[] a = new int[a.length()];
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) >= '0' && a.charAt(i) <= '9') {
                a[i] = a.charAt(i) - '0';
            } else {
                a[i] = a.charAt(i);
            }
        }
        int[][] f = new int[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            if (a[i] != '(') {
                if (i > 0 && a[i - 1] == '(') {
                    a = a.substring(i);
                    break;
                }
            }
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] != ')') {
                    a = a.substring(0, j + 1);
                    break;
                }
            }
            if (a.length == 1) {
                f[i] = new int[] { a[i], a[i] };
                continue;
            }
            int[] ri = new int[a.length - 1];
            int[] ra = new int[a.length - 1];
            for (int j = 1; j < a.length - 1; j++) {
                if (a[j] != '+' && a[j] != '-') {
                    continue;
                }
                int[] fl = f(a.substring(0, j));