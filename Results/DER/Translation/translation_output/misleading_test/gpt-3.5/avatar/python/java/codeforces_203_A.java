```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int t = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int da = sc.nextInt();
        int db = sc.nextInt();
        solve(d, t, a, b, da, db);
    }

    public static void solve(int d, int t, int a, int b, int da, int db) {
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < t; j++) {
                if (a - da * i + b - db * j == d || a - da * i == d || b - db * j == d || d == 0) {
                    System.out.println("YES");
                    return;
                }
            }
        }
        System.out.println("NO");
    }
}
```
Test input:
3 1 20 15 17 5

Expected output:
NGO
