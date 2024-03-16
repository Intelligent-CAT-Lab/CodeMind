import java.util.*;

public class p04018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w = sc.nextLine();
        int n = w.length();
        int t = -1;
        List<Integer> zl = new ArrayList<>();
        List<Integer> zr = new ArrayList<>();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            zl.add(0);
            zr.add(0);
        }
        for (int i = 1; i < n; i++) {
            if (i + zl.get(i - 1) < zl.get(zl.size() - 1) + zl.get(0)) {
                zl.set(i, zl.get(i - 1));
            } else {
                int j = max(0, zl.get(zl.size() - 1) + zl.get(0) - i);
                while (i + j < n && w.charAt(i + j) == w.charAt(i)) {
                    j++;
                }
                zl.set(i, j);
            }
        }
        for (int i = 1; i < n; i++) {
            for (int k = 2; k <= zl.get(i) / i + 2; k++) {
                zr.set(k * i - 1, 0);
            }
        }
        for (int j = 1; j <= n / 2; j++) {
            if (n % j == 0 && w.substring(0, n - j).equals(w.substring(j))) {
                t = j;
                break;
            }
        }
        if (t == -1) {
            System.out.println("1\n1");
        } else if (t == 1) {
            System.out.println(n);
            System.out.println(1);
        } else {
            for (int i = 0; i < n - 1; i++) {
                if (zl.get(i) && zr.get(n - 2 - i)) {
                    cnt++;
                }
            }
            System.out.println(2);
            System.out.println(cnt);
        }
    }
}