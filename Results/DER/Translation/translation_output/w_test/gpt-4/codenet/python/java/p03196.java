Below is the equivalent Java code for the provided Python example:

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();

        List<int[]> l = factorization(p);
        int ans = 1;
        for (int[] aL : l) {
            if (aL[1] >= n) {
                ans *= Math.pow(aL[0], aL[1] / n);
            }
        }
        System.out.println(ans);
    }

    private static List<int[]> factorization(int n) {
        List<int[]> arr = new ArrayList<>();
        int temp = n;
        for (int i = 2; i <= Math.sqrt(n) + 1; i++) {
            if (temp % i == 0) {
                int cnt = 0;
                while (temp % i == 0) {
                    cnt++;
                    temp /= i;
                }
                arr.add(new int[]{i, cnt});
            }
        }

        if (temp != 1) {
            arr.add(new int[]{temp, 1});
        }

        if (arr.isEmpty()) {
            arr.add(new int[]{n, 1});
        }

        return arr;
    }
}
```

Note that in the Java code, I use the `Scanner` class for input and `System.out.println` for output. The `factorization` function now returns a `List` of `int[]` (integer arrays) instead of a list of lists, since Java does not have native tuple support.

The `main` function collects inputs for `n` and `p`, calls the `factorization` method to get the factorization list, and then computes and prints the answer accordingly.
