
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String[] a = {"dream", "dreamer", "erase", "eraser", "dreamerase", "dreameraser"};
        int[] numlist = {0, 0, 0, 0, 0, 0};
        for (int i = 0; i < a.length; i++) {
            numlist[i] = S.length() - S.replace(a[i], "").length();
        }
        numlist[0] -= numlist[1];
        numlist[2] -= numlist[3];
        numlist[4] -= numlist[5];
        numlist[1] -= (numlist[4] + numlist[5]);
        numlist[0] += (numlist[4] + numlist[5]);
        int total = numlist[0] * 5 + numlist[1] * 7 + numlist[2] * 5 + numlist[3] * 6;
        if (total == S.length()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```

## 10. 1000000007

### 10.1. Problem

Given an integer N, print the last digit of N!.

### 10.2. Constraints

* 1 ≤ N ≤ 1000000000000

### 10.3. Input

Input is given from Standard Input in the following format:
```
N
```

### 10.4. Output

Print the last digit of N!.

### 10.5. Sample Input 1
```
10
```

### 10.6. Sample Output 1
```
0
```

### 10.7. Sample Input 2
```
1000000000000
```

### 10.8. Sample Output 2
```
0
```

### 10.9. Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long ans = 1;
        for (long i = 1; i <= N; i++) {
            ans *= i;
            ans %= 1000000007;
        }
        System.out.println(ans % 10);
    }
}
```
/src/main/java/com/github/takashiag/atcoder/abc120/B.java
package com.github.takashiag.atcoder.abc120;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int K = sc.nextInt();
        int count = 0;
        for (int i = 100; i >= 1; i--) {
            if (A % i == 0 && B % i == 0) {
                count++;
                if (count == K) {
                    System.out.println(i);
                    return;
                }
            }
        }
    }
}
/src/main/java/com/github/takashiag/atcoder/abc120/C.java
package com.github.takashiag.atcoder.abc120;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int count0 = 0;
        int count1 = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '0') {
                count0++;
            } else {
                count1++;
            }
        }
        System.out.println(Math.min(count0, count1) * 2);
    }
}
/src/main/java/com/github/takashiag/atcoder/abc120/A.java
package com.github.takashiag.atcoder.abc120;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int ans = B / A;
        if (ans > C) {
            System.out.println(C);
        } else {
            System.out.println(ans);
        }
    }
}
  }
}
/src/main/java/com/github/takashiag/atcoder/abc120/D.java
package com.github.takashiag.atcoder.abc120;

import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[M];
        int[] B = new int[M];
        for (int i = 0; i < M; i++) {
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
        }
        int[] parent = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            parent[i] = i;
        }
        long[] ans = new long[M];
        long count = N * (N - 1) / 2;
        ans[M - 1] = count;
        for (int i = M - 1; i >= 0; i--) {
            int a = A[i];
            int b = B[i];
            if (root(parent, a) != root(parent, b)) {
                count -= size(parent, a) * size(parent, b);
                union(parent, a, b);
            }
            ans[i - 1] = count;
        }
        for (int i = 0; i < M; i++) {
            System.out.println(ans[i]);
        }
    }

    private static int root(int[] parent, int x) {
        if (parent[x] == x) {
            return x;
        }
        return parent[x] = root(parent, parent[x]);
    }

    private static void union(int[] parent, int x, int y) {
        x = root(parent, x);
        y = root(parent, y);
        if (x == y) {
            return;
        }
        parent[x] = y;
    }

    private static int size(int[] parent, int x) {
        x = root(parent, x);
        int count = 0;
        for (int i = 1; i < parent.length; i++) {
            if (root(parent, i) == x) {
                count++;
            }
        }
        return count;
  /src/main/java/com/github/takashiag/atcoder/abc120/E.java
package com.github.takashiag.atcoder.abc120;
