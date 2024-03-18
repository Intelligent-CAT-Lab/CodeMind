Below is the equivalent Java code for the Python script you provided:

```java
import java.util.Scanner;

public class Main {

    private static final int[] six = new int[]{6, 36, 216, 1296, 7776, 46656, 279936};
    private static final int[] nine = new int[]{9, 81, 729, 6561, 59049, 531441, 4782969};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(DP(N));
        scanner.close();
    }

    private static int DP(int n) {
        if (n < 6) {
            return n;
        }
        int tmp = n;
        int count6 = 0;
        int count9 = 0;

        for (int i = six.length - 1; i >= 0; i--) {
            int sixx = six[i];
            if (sixx <= n) {
                n -= sixx;
                count6 = 1;
                break;
            }
        }
        count6 += DP(n);
        n = tmp;

        if (n < 9) {
            return count6;
        }

        for (int i = nine.length - 1; i >= 0; i--) {
            int ninee = nine[i];
            if (ninee <= n) {
                n -= ninee;
                count9 = 1;
                break;
            }
        }
        count9 += DP(n);
        n = tmp;

        return Math.min(count6, count9);
    }
}
```
Note that Java uses zero-based indexing, so I reversed the order of array `six` and `nine` elements compared to the Python version, which uses list slicing with `[::-1]` to reverse the list. This way we can directly loop from the last element to the first when searching for the largest power of six or nine that is less than or equal to `n`.
