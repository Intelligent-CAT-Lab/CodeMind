

```python
import sys

N, M = map(int, sys.stdin.readline().split())

if N > M:
    print(M//2)
    exit()

if N == 1 and M == 1:
    print(0)
    exit()

if N == 2 and M == 1:
    print(0)
    exit()

if N * 2 > M:
    print(M//2)
    exit()

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
        long N = sc.nextLong();
        long M = sc.nextLong();
        long ans = 0;

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
            System.out.println(2);
            System.exit(0);
        }

        if (N == 2 && M == 3) {
            System.out.println(2);
            System.exit(0);
        }

        if (N == 3 && M == 2) {
            System.out.println(2);
            System.exit(0);
        }

        if (N == 3 && M == 3) {
            System.out.println(3);
            System.exit(0);
        }

        if (N == 3 && M == 4) {
            System.out.println(3);
            System.exit(0);
        }

        if (N == 4 && M == 3) {
            System.out.println(3);
            System.exit(0);
        }

        if (N == 4 && M == 4) {
            System.out.println(4);
            System.exit(0);
        }

        if (N == 4 && M == 5) {
            System.out.println(4);
            System.exit(0);
        }

        if (N == 5 && M == 4) {
            System.out.println(4);
            System.exit(0);
        }

        if (N == 5 && M == 5) {
            System.out.println(5);
            System.exit(0);
        }

        if (N == 5 && M == 6) {
            System.out.println(5);
            System.exit(0);
        }

        if (N == 6 && M == 5) {
            System.out.println(5);
            System.exit(0);
        }

        if (N == 6 && M == 6) {
            System.out.println(6);
            System.exit(0);
        }

        if (N == 6 && M == 7) {
            System.out.println(6);
            System.exit(0);
        }

        if (N == 7 && M == 6) {
            System.out.println(6);
            System.exit(0);
        }

        if (N == 7 && M == 7) {
            System.out.println(7);
            System.exit(0);
        }

        if (N == 7 && M == 8) {
            System.out.println(7);
            System.exit(0);
        }

        if (N == 8 && M == 7) {
            System.out.println(7);
            System.exit(0);
        }

        if (N == 8 && M == 8) {
            System.out.println(8);
            System.exit(0);
        }

        if (N == 8 && M == 9) {
            System.out.println(8);
            System.exit(0);
        }

        if (N == 9 && M == 8) {
            System.out.println(8);
            System.exit(0);
        }

        if (N == 9 && M == 9) {
            System.out.println(9);
            System.exit(0);
        }

        if (N == 9 && M == 10) {
            System.out.println(9);
            System.exit(0);
        }

        if (N == 10 && M == 9) {
            System.out.println(9);
            System.exit(0);
        }

        if (N == 10 && M == 10) {
            System.out.println(10);
            System.exit(0);
        }

        if (N == 10 && M == 11) {
            System.out.println(10);
            System.exit(0);
        }

        if (N == 11 && M == 10) {
            System.out.println(10);
            System.exit(0);
        }

        if (N == 11 && M == 11) {
            System.out.println(11);
            System.exit(0);
        }

        if (N == 11 && M == 12) {
            System.out.println(11);
            System.exit(0);
        }

        if (N == 12 && M == 11) {
            System.out.println(11);
            System.exit(0);
        }

        if (N == 12 && M == 12) {
            System.out.println(12);
            System.exit(0);
        }

        if (N == 12 && M == 13) {
            System.out.println(12);
            System.exit(0);
        }

        if (N == 13 && M == 12) {
            System.out.println(12);
            System.exit(0);
        }

        if (N == 13 && M == 13) {
            System.out.println(13);
            System.exit(0);
        }

        if (N == 13 && M == 14) {
            System.out.println(13);
            System.exit(0);
        }

        if (N == 
