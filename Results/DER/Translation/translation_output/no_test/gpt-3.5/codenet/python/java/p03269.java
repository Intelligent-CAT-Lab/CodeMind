```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();

        int d = 0;
        for (int i = 0; i < 30; i++) {
            if (Math.pow(2, i) <= l) {
                d = i;
            } else {
                break;
            }
        }
        int n = d + 1;
        int m = 2 * d;
        List<int[]> ans = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            ans.add(new int[]{i, i + 1, 0});
            ans.add(new int[]{i, i + 1, (int) Math.pow(2, i - 1)});
        }

        while (l > Math.pow(2, d)) {
            for (int i = n - 1; i > 0; i--) {
                if (l - Math.pow(2, i - 1) > Math.pow(2, d) - 1) {
                    ans.add(new int[]{i, n, (int) (l - Math.pow(2, i - 1))});
                    m++;
                    l -= Math.pow(2, i - 1);
                    break;
                }
            }
        }

        System.out.println(n + " " + m);
        for (int[] a : ans) {
            for (int val : a) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
```

