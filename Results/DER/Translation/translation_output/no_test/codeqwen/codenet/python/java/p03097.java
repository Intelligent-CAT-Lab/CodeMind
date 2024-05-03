Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        int popCount = 0;
        for (int i = 0; i < 17; i++) {
            popCount += ((a >> i) & 1) == 1 ? 1 : 0;
        }
        if (popCount % 2 == 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            int[] result = f(n, a, b);
            for (int i : result) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static int[] f(int m, int x, int y) {
        if (m == 1) {
            if (x == 0) {
                return new int[]{0, 1};
            } else {
                return new int[]{1, 0};
            }
        }

        int[] res = new int[]{x};
        int diff = 0;
        for (int i = 0; i < m; i++) {
            if ((x >> i) % 2 != (y >> i) % 2) {
                diff = i;
                break;
            }
        }
        int s = (x % (2 << diff)) + (((x >> (diff + 1)) * (2 << diff)) >> 1);
        int t = (y % (2 << diff)) + (((y >> (diff + 1)) * (2 << diff)) >> 1);
        int u = s ^ 1;
        int[] left = f(m - 1, s, u);
        int[] right = f(m - 1, u, t);
        int x
