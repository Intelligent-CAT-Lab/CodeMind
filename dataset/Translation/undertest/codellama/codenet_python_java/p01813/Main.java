import java.util.Scanner;

public class p01813 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();

        int[][] fm = new int[s.length()][2];
        int[] a = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                a[i] = s.charAt(i) - '0';
            } else {
                a[i] = s.charAt(i);
            }
        }

        int[] r = f(a, fm);
        System.out.println(r[1]);
    }

    private static int[] f(int[] a, int[][] fm) {
        int[] r = new int[2];
        if (a.length == 2) {
            r[0] = Integer.MAX_VALUE;
            r[1] = Integer.MIN_VALUE;
            return r;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != '(') {
                if (i > 0) {
                    a = Arrays.copyOfRange(a, i, a.length);
                }
                break;
            }
        }

        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] != ')') {
                a = Arrays.copyOfRange(a, 0, i + 1);
                break;
            }
        }

        if (a.length == 1) {
            r[0] = a[0];
            r[1] = a[0];
            return r;
        }

        int[] ri = new int[a.length - 2];
        int[] ra = new int[a.length - 2];

        for (int i = 1; i < a.length - 1; i++) {
            if (!Character.isDigit(a[i]) || (i > 1 && a[i - 2] == '(') || (i + 2 < a.length && a[i + 2] == ')')) {
                continue;
            }

            int[] fl = f(Arrays.copyOfRange(a, 0, i), fm);
            int[] fr = f(Arrays.copyOfRange(a, i + 1, a.length), fm);

            if (a[i] == '+') {
                ri[i - 1] = fl[0] + fr[0];
                ra[i - 1] = fl[1] + fr[1];
            } else {
                ri[i - 1] = fl[0] - fr[1];
                ra[i - 1] = fl[1] - fr[0];
            }
        }

        r[0] = Arrays.stream(ri).min().getAsInt();
        r[1] = Arrays.stream(ra).max().getAsInt();

        return r;
    }
}