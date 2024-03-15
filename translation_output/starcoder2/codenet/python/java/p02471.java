
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a < b) {
            int t = a;
            a = b;
            b = t;
        }
        int x0 = 0, y0 = 1, gcd = b;
        while (a % b != 0) {
            int q = a / b;
            int r = a % b;
            a = b;
            b = r;
            int x = y0;
            int y = x0 - q * y0;
            x0 = x;
            y0 = y;
        }
        int dx = b / gcd;
        int dy = -a / gcd;
        if (dx < 0) {
            dx = -dx;
            dy = -dy;
        }
        int x = x0;
        int y = y0;
        int mag = Math.abs(x) + Math.abs(y);
        while (true) {
            int x1 = x + dx;
            int y1 = y + dy;
            int mag1 = Math.abs(x1) + Math.abs(y1);
            if (mag1 >= mag) {
                break;
            }
            mag = mag1;
            x = x1;
            y = y1;
        }
        while (true) {
            int x1 = x - dx;
            int y1 = y - dy;
            int mag1 = Math.abs(x1) + Math.abs(y1);
            if (mag1 > mag) {
                break;
            }
            mag = mag1;
            x = x1;
            y = y1;
        }
        System.out.println(x + " " + y);
    }
}
```

## 1000000007

### 1000000007

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int[][] b = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        int[][] c = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                c[i][j] = sc.nextInt();
            }
        }
        int[][] d = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                d[i][j] = sc.nextInt();
            }
        }
        int[][] e = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                e[i][j] = sc.nextInt();
            }
        }
        int[][] f = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                f[i][j] = sc.nextInt();
            }
        }
        int[][] g = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                g[i][j] = sc.nextInt();
            }
        }
        int[][] h = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                h[i][j] = sc.nextInt();
            }
        }
        int[][] i = new int[n][m];
        for (int j = 0; j < n; j++) {
            for (int l = 0; l < m; l++) {
                i[j][l] = sc.nextInt();
            }
        }
        int[][] j = new int[n][m];
        for (int j2 = 0; j2 < n; j2++) {
            for (int l2 = 0; l2 < m; l2++) {
                j[j2][l2] = sc.nextInt();
            }
        }
        int[][] k2 = new int[n][m];
        for (int j3 = 0; j3 < n; j3++) {
            for (int l3 = 0; l3 < m; l3++) {
                k2[j3][l3] = sc.nextInt();
            }
        }
        int[][] l = new int[n][m];
        for (int j4 = 0; j4 < n; j4++) {
            for (int l4 = 0; l4 < m; l4++) {
                l[j4][l4] = sc.nextInt();
            }
        }
        int[][] m2 = new int[n][m];
        for (int j5 = 0; j5 < n; j5++) {
            for (int l5 = 0; l5 < m; l5++) {
                m2[j5][l5] = sc.nextInt();
            }
        }
        int[][] n2 = new int[n][m];
        for (int j6 = 0; j6 < n; j6++) {
            for (int l6 = 0; l6 < m; l6++) {
                n2[j6][l6] = sc.nextInt();
            }
        }
        int[][] o = new int[n][m];
        for (int j7 = 0; j7 < n; j7++) {
            for (int l7 = 0; l7 < m; l7++) {
                o[j7][l7] = sc.nextInt();
            }
        }
        int[][] p = new int[n][m];
        for (int j8 = 0; j8 < n; j8++) {
            for (int l8 = 0; l8 < m; l8++) {
                p[j8][l8] = sc.nextInt();
            }
        }
        int[][] q = new int[n][m];
        for (int j9 = 0; j9 < n; j9++) {
            for (int l9 = 0; l9 < m;
