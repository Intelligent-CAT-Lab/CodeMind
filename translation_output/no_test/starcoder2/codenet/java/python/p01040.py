
```
a0 = 1
days = [0,31,28,31,30,31,30,31,31,30,31,30,31]

def isUruu(y):
    if y % 400 == 0:
        return True
    elif y % 100 == 0:
        return False
    else:
        return y % 4 == 0

def count(y1,m1,d1,a,y2,m2,d2):
    count = 0
    while True:
        if y1 > y2 or y1 == y2 and m1 > m2 or y1 == y2 and m1 == m2 and d1 > d2:
            break
        if d1 == 13 and a == 5:
            count += 1
        d1 += 1
        if d1 > days[m1] + (m1 == 2 and isUruu(y1) and 1 or 0):
            d1 = 1
            m1 += 1
        if m1 > 12:
            m1 = 1
            y1 += 1
        a = (a + 1) % 7
    return count

def count400(y1,m1,d1,a):
    return count(y1,m1,d1,a,y1+400,12,31)

def main():
    y1,m1,d1,y2,m2,d2 = map(int,raw_input().split())
    d1 -= 1
    if d1 <= 0:
        m1 -= 1
        if m1 <= 0:
            y1 -= 1
            m1 = 12
        d1 = days[m1]
    yy1 = (y1 - 1) / 400
    c1 = count400(yy1 * 400 + 1, 1, 1, a0) * yy1 + count(yy1 * 400 + 1, 1, 1, a0, y1, m1, d1)
    yy2 = (y2 - 1) / 400
    c2 = count400(yy2 * 400 + 1, 1, 1, a0) * yy2 + count(yy2 * 400 + 1, 1, 1, a0, y2, m2, d2)
    print c2 - c1

if __name__ == '__main__':
    main()
```

## 01041

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p01041 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }
        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            d[i] = sc.nextInt();
        }
        int[] e = new int[n];
        for (int i = 0; i < n; i++) {
            e[i] = sc.nextInt();
        }
        int[] f = new int[n];
        for (int i = 0; i < n; i++) {
            f[i] = sc.nextInt();
        }
        int[] g = new int[n];
        for (int i = 0; i < n; i++) {
            g[i] = sc.nextInt();
        }
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        int[] i = new int[n];
        for (int j = 0; j < n; j++) {
            i[j] = sc.nextInt();
        }
        int[] j = new int[n];
        for (int k = 0; k < n; k++) {
            j[k] = sc.nextInt();
        }
        int[] k = new int[n];
        for (int l = 0; l < n; l++) {
            k[l] = sc.nextInt();
        }
        int[] l = new int[n];
        for (int m = 0; m < n; m++) {
            l[m] = sc.nextInt();
        }
        int[] m = new int[n];
        for (int o = 0; o < n; o++) {
            m[o] = sc.nextInt();
        }
        int[] o = new int[n];
        for (int p = 0; p < n; p++) {
            o[p
