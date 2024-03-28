import java.util.*;

public class p01813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] result = new int[2];
        Map<String, Integer[]> fm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (a[i] >= '0' && a[i] <= '9') {
                a[i] = a[i] * 10 + a[i - 1];
            } else {
                a[i] = a[i];
            }
        }
        result = f(a);
        System.out.println(result[1]);
    }

    public static int[] f(int[] a) {
        String key = Arrays.toString(a);
        if (fm.containsKey(key)) {
            return fm.get(key);
        }
        if (a.length == 2) {
            fm.put(key, new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE});
            return new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE};
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
            return new int[]{a[0], a[0]};
        }
        int[] ri = new int[2];
        int[] ra = new int[2];
        int len = a.length;
        for (int i = 1; i < len - 1; i++) {
            if (a[i] != '+' && a[i] != '-' && (i > 1 && a[i - 2] == '(') || (i + 2 < len && a[i + 2] == ')')) {
                continue;
            }
            int[] fl = f(Arrays.copyOfRange(a, 0, i));
            int[] fr = f(Arrays.copyOfRange(a, i + 1, len));
            if (a[i] == '+') {
                ri[0] = fl[0] + fr[0];
                ra[0] = fl[1] + fr[1];
            } else {
                ri[0] = fl[0] - fr[1];
                ra[0] = fl[1] - fr[0];
            }
        }
        ri[1] = Math.min(ri[0], ra[0]);
        ra[1] = Math.max(ri[0], ra[0]);
        fm.put(key, new int[]{ri[1], ra[1]});
        return new int[]{ra[1], ri[1]};
    }
}