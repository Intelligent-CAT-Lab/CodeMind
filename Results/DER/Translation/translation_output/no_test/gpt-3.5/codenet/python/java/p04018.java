```java
import java.util.*;

public class ZAlgorithm {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Character> w = new ArrayList<>();
        for (char ch : input.toCharArray()) {
            w.add(ch);
        }
        int n = w.size();
        int t = -1;

        int[] z = Z(w);

        for (int j = 1; j <= n / 2; j++) {
            if (n % j == 0 && w.subList(0, n - j).equals(w.subList(j, n))) {
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
            List<Character> wReverse = new ArrayList<>(w);
            Collections.reverse(wReverse);
            int[] zl = Z(w);
            int[] zr = Z(wReverse);
            int cnt = 0;
            for (int i = 0; i < n - 1; i++) {
                if (zl[i] > 0 && zr[n - 2 - i] > 0) {
                    cnt++;
                }
            }
            System.out.println(2);
            System.out.println(cnt);
        }
    }

    private static int[] Z(List<Character> s) {
        int m = s.size();
        int[] z = new int[m];
        int c = 0;
        int[] f = new int[m];
        Arrays.fill(f, 1);
        for (int i = 1; i < m; i++) {
            if (i + z[i - c] < c + z[c]) {
                z[i] = z[i - c];
            } else {
                int j = Math.max(0, c + z[c] - i);
                while (i + j < m && s.get(j).equals(s.get(i + j)))
                    j++;
                z[i] = j;
                c = i;
            }
        }
        for (int p = 1; p < m; p++) {
            for (int k = 2; k <= z[p] / p + 1; k++) {
                f[k * p - 1] = 0;
            }
        }
        return f;
    }
}
```
