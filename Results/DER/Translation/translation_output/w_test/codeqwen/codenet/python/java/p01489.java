Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();

        int l = 0, r = k;
        while ((r - l) > 1) {
            int m = (l + r) / 2;
            if (m * (m + 1) < k) {
                l = m;
            } else {
                r = m;
            }
        }
        int b = l;

        int ad = k - (b * (b + 1));

        int d = ((ad - 1) % (b + 1)) + 1;

        int x = 2 * b + 1;
        int y = 1;
        if (ad - d > 0) {
            x += 1;
        }

        if (d <= (b + 1 + 1) / 2) {
            int dd = d * 2 - 1;
        } else {
            int dz = (b + 1 - d);
            int dd = dz * 2 + 2;
        }

        x -= (dd - 1);
        y += (dd - 1);

        int mod = 1000000007;

        int[][] a = new int[2][2];
        a[0][0] = 1;
        a[0][1] = 1;
        a[1][0] = 1;
        a[1][1] = 0;

        int[][] b = new int[2][2];
        b[0][0] = 1;
        b[0][1] = 1;
        b[1][0] = 1;
        b[1][1] = 0;

        int[][] res = new int[2][2];

        int x1 = x;
        int y1 = y;

        while (x1 > 0) {
            if (x1 % 2
