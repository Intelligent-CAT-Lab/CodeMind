

```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double k = 0;
        double t = 0;

        if (Math.sqrt(8 * x + 1) == Math.floor(Math.sqrt(8 * x + 1))) {
            double a = (-1 + Math.sqrt(1 + 8 * x)) / 2;
            System.out.println((int) a);
        } else {
            double x1 = (-1 + Math.sqrt(1 + 8 * x)) / 2;
            System.out.println((int) x1 + 1);
        }
    }
}
```

## 2.

Write a program that takes a number and prints its digits from left to right and then from right to left.

Sample input:

123456789

Expected output:

123456789

987654321

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = x;
        int z = 0;
        while (x > 0) {
            System.out.print(x % 10);
            x /= 10;
        }
        System.out.println();
        while (y > 0) {
            z = z * 10 + y % 10;
            y /= 10;
        }
        System.out.println(z);
    }
}
```


```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int t = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        int o = sc.nextInt();
        int p = sc.nextInt();
        int q = sc.nextInt();
        int r = sc.nextInt();
        int s = sc.nextInt();
        int t1 = sc.nextInt();
        int u = sc.nextInt();
        int v = sc.nextInt();
        int w = sc.nextInt();
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int z1 = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        int g = sc.nextInt();
        int h = sc.nextInt();
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k1 = sc.nextInt();
        int l1 = sc.nextInt();
        int m1 = sc.nextInt();
        int n1 = sc.nextInt();
        int o1 = sc.nextInt();
        int p1 = sc.nextInt();
        int q1 = sc.nextInt();
        int r1 = sc.nextInt();
        int s1 = sc.nextInt();
        int t2 = sc.nextInt();
        int u1 = sc.nextInt();
        int v1 = sc.nextInt();
        int w1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int z2 = sc.nextInt();
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int c1 = sc.nextInt();
        int d1 = sc.nextInt();
        int e1 = sc.nextInt();
        int f1 = sc.nextInt();
        int g1 = sc.nextInt();
        int h1 = sc.nextInt();
        int i1 = sc.nextInt();
        int j1 = sc.nextInt();
        int k2 = sc.nextInt();
        int l2 = sc.nextInt();
        int m2 = sc.nextInt();
        int n2 = sc.nextInt();
        int o2 = sc.nextInt();
        int p2 = sc.nextInt();
        int q2 = sc.nextInt();
        int r2 = sc.nextInt();
        int s2 = sc.nextInt();
        int t3 = sc.nextInt();
        int u2 = sc.nextInt();
        int v2 = sc.nextInt();
        int w2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        int z3 = sc.nextInt();
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        int c2 = sc.nextInt();
        int d2 = sc.nextInt();
        int e2 = sc.nextInt();
        int f2 = sc.nextInt();
        int g2 = sc.nextInt();
        int h2 = sc.nextInt();
        int i2 = sc.nextInt();
        int j2 = sc.nextInt();
        int k3 = sc.nextInt();
        int l3 = sc.nextInt();
        int m3 = sc.nextInt();
        int n3 = sc.nextInt();
        int o3 = sc.nextInt();
        int p3 = sc.nextInt();
        int q3 = sc.nextInt();
        int r3 = sc.nextInt();
        int s3 = sc.nextInt();
        int t4 = sc.nextInt();
        int u3 = sc.nextInt();
        int v3 = sc.nextInt();
        int w3 = sc.nextInt();
        int x4 = sc.nextInt();
        int y4 = sc.nextInt();
        int z4 = sc.nextInt();
        int a3 = sc.nextInt();
        int b3 = sc.nextInt();
        int c3 = sc.nextInt();
        int d3 = sc.nextInt();
        int e3 = sc.nextInt();
        int f3 = sc.nextInt();
        int g3 = sc.nextInt();
        int h3 = sc.nextInt();
        int i3 = sc.nextInt();
        int j3 = sc.nextInt();
        int k4 = sc.nextInt();
        int l4 = sc.nextInt();
        int m4 = sc.nextInt();
        int n4 = sc.nextInt();
        int o4 = sc.nextInt();
        int p4 = sc.nextInt();
        int q4 = sc.nextInt();
        int r4 = sc.nextInt();
        int s4 = sc.nextInt();
        int t5 = sc.nextInt();
        int u4 = sc.nextInt();
        int v4 = sc.nextInt();
        int w4 = sc.nextInt();
        int x5 = sc.nextInt();
        int y5 = sc.nextInt();
        int z5 = sc.nextInt();
        int a4 = sc.nextInt();
        int b4 = sc.nextInt();
        int c4 = sc.nextInt();
        int d4 = sc.nextInt();
        int e4 = sc.nextInt();
        int f4 = sc.nextInt();
        int g4 = sc.nextInt();
        int h4 = sc.nextInt();
        int i4 = sc.nextInt();
        int j4 = sc.nextInt();
        int k5 = sc.nextInt();
        int l5 = sc.nextInt();
        int m5 = sc.nextInt();
        int n5 = sc.nextInt();
        int o5 = sc.nextInt();
        int p5 = sc.nextInt();
        int q5 = sc.nextInt();
        int r5 = sc.nextInt();
        int s5 = sc.nextInt();
        int t6 = sc.nextInt();
        int u5 = sc.nextInt();
        int v5 = sc.nextInt();
        int w5 = sc.nextInt();
        int x6 = sc.nextInt();
        int y6 = sc.nextInt();
        int z6 = sc.nextInt();
        int a5 = sc.nextInt();
        int b5 = sc.nextInt();
        int c5 = sc.nextInt();
        int d5 = sc.nextInt();
        int e5 = sc.nextInt();
        int f5 = sc.nextInt();
        int g5 = sc.nextInt();
        int h5 = sc.nextInt();
        int i5 = sc.nextInt();
        int j5 = sc.nextInt();
        int k6 = sc.nextInt();
        int l6 = sc.nextInt();
        int m6
