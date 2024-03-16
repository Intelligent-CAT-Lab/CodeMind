import java.util.*;
import java.lang.*;
import java.math.*;

class Main {
    static int mod = 1000000007;
    static int inf = 1000000000;
    static int dd[][] = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
    static int ddn[][] = {{-1, 0}, {-1, 1}, {0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}, {-1, -1}};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[50000];
        a[0] = 0;
        for (int i = 1; i < 50000; i++) {
            a[i] = a[i - 1] + i;
        }
        int t = Arrays.binarySearch(a, n);
        if (t < 0) {
            t = -t - 1;
        }
        int r[] = new int[t];
        Arrays.fill(r, 1);
        for (int i = 0; i < t; i++) {
            int ai = a[t - i];
            int ti = t + i;
            if (n < ai) {
                int ts = Math.min(t, ai - n);
                int tmp = r[ti - ts];
                r[ti - ts] = r[ti];
                r[ti] = tmp;
                n -= t - ts;
            } else {
                break;
            }
        }
        for (int i = 0; i < t; i++) {
            System.out.print(r[i] == 1 ? "(" : ")");
        }
        System.out.println();
    }
}


# 参考

[官方题解](https://atcoder.jp/contests/abc172/editorial)

[官方题解翻译](https://www.cnblogs.com/ECJTUACM-873284962/p/12684998.html)

[官方题解翻译](https://www.cnblogs.com/ECJTUACM-873284962/p/12684998.html)

[官方题解翻译](https://www.cnblogs.com/ECJTUACM-873284962/p/12684998.html)

[官方题解翻译](https://www.cnblogs.com/ECJTUACM-873284962/p/12684998.html)

[官方题解翻译](https://www.cnblogs.com/ECJTUACM-873284962/p/12684998.html)

[官方题解翻译](https://www.cnblogs.com/ECJTUACM-873284962/p/12684998.html)

[官方题解翻译](https://www.cnblogs.com/ECJTUACM-873284962/p/12684998.html)

[官方题解翻译](https://www.cnblogs.com/ECJTUACM-873284962/p/12684998.html)

[官方题解翻译](https://www.cnblogs.com/ECJTUACM-873284962/p/12684998.html)

[官方题解翻译](https://www.cnblogs.com/ECJTUACM-873284962/p/12684998.html)

[官方题解翻译](https://www.cnblogs.com/ECJTUACM-873284962/p/12684998.html)

[官方题解翻译](https://www.cnblogs.com/ECJTUACM-873284962/p/12684998.html)

[官方题解翻译](https://www.cnblogs.com/ECJTUACM-873284962/p/12684998.html)

[官方题解翻译](https://www.cnblogs.com/ECJTUACM-873284962/p/12684998.html)

[官方题解翻译](https://www.cnblogs.com/ECJTUACM-873284962/p/12684998.html)

[官方题解翻译](https://www.cnblogs.com/ECJTUACM-873284962/p/12684998.html)

[官方题解翻译](https://www.cnblogs.com/ECJTUACM-873284962/p/12684998.html)

[官方题解翻译](https://www.cnblogs.com/ECJTUACM-873284962/p/12684998.html)

[官方题解翻译](https://www.cnblogs.com/ECJTUACM-873284962/p/12684998.html)

[官方题解翻译](https://www.cnblogs.com/ECJTUACM-873284962/p/12684998.html)

[官方题解翻译](https://www.cnblogs.com/ECJTUACM-873284962/p/12684998.html)

[官方题解翻译](https://www.cnblogs.com/ECJTUACM-873284962/p/12684998.html)

[官方题解翻译](https://www.cnblogs.com/ECJTUACM-873284962/p/12684998.html