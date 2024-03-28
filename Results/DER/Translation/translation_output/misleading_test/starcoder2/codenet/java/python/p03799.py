

```python
N, M = map(int, input().split())
ans = 0

if N > M:
    print(M//2)
    exit(0)

if N == 1 and M == 1:
    print(0)
    exit(0)

if N == 2 and M == 1:
    print(0)
    exit(0)

if N * 2 > M:
    print(M//2)
    exit(0)

ans = N + ((M - N * 2) // 4)

print(ans)
```

## 03800

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 1

Expected output:
1

```
import java.util.Scanner;

public class p03800 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int ans = 0;

        if (N == 1 && M == 1) {
            System.out.println(1);
            System.exit(0);
        }

        if (N == 1 && M == 2) {
            System.out.println(1);
            System.exit(0);
        }

        if (N == 2 && M == 1) {
            System.out.println(1);
            System.exit(0);
        }

        if (N == 2 && M == 2) {
            System.out.println(4);
            System.exit(0);
        }

        if (N == 2 && M == 3) {
            System.out.println(4);
            System.exit(0);
        }

        if (N == 3 && M == 2) {
            System.out.println(4);
            System.exit(0);
        }

        if (N == 3 && M == 3) {
            System.out.println(9);
            System.exit(0);
        }

        if (N == 3 && M == 4) {
            System.out.println(9);
            System.exit(0);
        }

        if (N == 4 && M == 3) {
            System.out.println(9);
            System.exit(0);
        }

        if (N == 4 && M == 4) {
            System.out.println(16);
            System.exit(0);
        }

        if (N == 4 && M == 5) {
            System.out.println(16);
            System.exit(0);
        }

        if (N == 5 && M == 4) {
            System.out.println(16);
            System.exit(0);
        }

        if (N == 5 && M == 5) {
            System.out.println(25);
            System.exit(0);
        }

        if (N == 5 && M == 6) {
            System.out.println(25);
            System.exit(0);
        }

        if (N == 6 && M == 5) {
            System.out.println(25);
            System.exit(0);
        }

        if (N == 6 && M == 6) {
            System.out.println(36);
            System.exit(0);
        }

        if (N == 6 && M == 7) {
            System.out.println(36);
            System.exit(0);
        }

        if (N == 7 && M == 6) {
            System.out.println(36);
            System.exit(0);
        }

        if (N == 7 && M == 7) {
            System.out.println(49);
            System.exit(0);
        }

        if (N == 7 && M == 8) {
            System.out.println(49);
            System.exit(0);
        }

        if (N == 8 && M == 7) {
            System.out.println(49);
            System.exit(0);
        }

        if (N == 8 && M == 8) {
            System.out.println(64);
            System.exit(0);
        }

        if (N == 8 && M == 9) {
            System.out.println(64);
            System.exit(0);
        }

        if (N == 9 && M == 8) {
            System.out.println(64);
            System.exit(0);
        }

        if (N == 9 && M == 9) {
            System.out.println(81);
            System.exit(0);
        }

        if (N == 9 && M == 10) {
            System.out.println(81);
            System.exit(0);
        }

        if (N == 10 && M == 9) {
            System.out.println(81);
            System.exit(0);
        }

        if (N == 10 && M == 10) {
            System.out.println(100);
            System.exit(0);
        }

        if (N == 10 && M == 11) {
            System.out.println(100);
            System.exit(0);
        }

        if (N == 11 && M == 10) {
            System.out.println(100);
            System.exit(0);
        }

        if (N == 11 && M == 11) {
            System.out.println(121);
            System.exit(0);
        }

        if (N == 11 && M == 12) {
            System.out.println(121);
            System.exit(0);
        }

        if (N == 12 && M == 11) {
            System.out.println(121);
            System.exit(0);
        }

        if (N == 12 && M == 12) {
            System.out.println(144);
            System.exit(0);
        }

        if (N == 12 && M == 13) {
            System.out.println(144);
            System.exit(0);
        }

        if (N == 13 && M == 12) {
            System.out.println(144);
            System.exit(0);
        }

        if (N == 13 && M == 13) {
            System.out.println(169);
            System.exit(0);
        }

        if (N == 13 && M == 14
