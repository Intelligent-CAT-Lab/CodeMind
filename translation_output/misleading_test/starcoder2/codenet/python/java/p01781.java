

```
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int N = sc.nextInt();

        int[] S = new int[Math.max(2*(X+Y+Z+1), 2*N+2)];
        for (int k = 0; k < N; k++) {
            S[k] = k*(k+1)/2;
        }
        for (int k = N; k < X+Y+Z+1; k++) {
            S[k] = k*(k+1)/2 + S[k-N];
        }

        int calc(int k, int x, int y, int z) {
            return S[k] - S[k-x] - S[k-y] - S[k-z] + S[k-(x+y)] + S[k-(y+z)] + S[k-(z+x)] - S[k-(x+y+z)];
        }

        int[] ans = new int[N];
        for (int b = 0; b < N; b++) {
            int k = (X+Y+Z - b - 1) / N * N + b;
            ans[b] = (
                  calc(k+1, X-A, Y-B, Z-C)
                + calc(k, A, Y-B, Z-C)
                + calc(k, X-A, B, Z-C)
                + calc(k, X-A, Y-B, C)
                + calc(k-1, A, B, Z-C)
                + calc(k-1, X-A, B, C)
                + calc(k-1, A, Y-B, C)
                + calc(k-2, A, B, C)
            );
        }
        for (int i = 0; i < N; i++) {
            pw.print(ans[i] + " ");
        }
        pw.println();
        pw.flush();
    }
}

```

## 2. 1000000007

### 2.1. Problem

Given a positive integer N, find the number of ways to write N as a sum of two positive integers.

### 2.2. Input

The input consists of a single integer N.

### 2.3. Output

Print the number of ways to write N as a sum of two positive integers.

### 2.4. Constraints

1 ≤ N ≤ 1000000000

### 2.5. Sample Input

```
10
```

### 2.6. Sample Output

```
4
```

### 2.7. Explanation

The four ways are:

10 = 1 + 9
10 = 2 + 8
10 = 3 + 7
10 = 4 + 6

### 2.8. Solution

```
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int N = sc.nextInt();
        int ans = 0;
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                ans++;
            }
        }
        pw.println(ans);
        pw.flush();
    }
}

```

## 3. 1000000008

### 3.1. Problem

Given a positive integer N, find the number of ways to write N as a sum of two positive integers.

### 3.2. Input

The input consists of a single integer N.

### 3.3. Output

Print the number of ways to write N as a sum of two positive integers.

### 3.4. Constraints

1 ≤ N ≤ 1000000000

### 3.5. Sample Input

```
10
```

### 3.6. Sample Output

```
4
```

### 3.7. Explanation

The four ways are:

10 = 1 + 9
10 = 2 + 8
10 = 3 + 7
10 = 4 + 6

### 3.8. Solution

```
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int N = sc.nextInt();
        int ans = 0;
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                ans++;
            }
        }
        pw.println(ans);
        pw.flush();
    }
}

```

## 4. 1000000009

### 4.1. Problem

Given a positive integer N, find the number of ways to write N as a sum of two positive integers.

### 4.2. Input

The input consists of a single integer N.

### 4.3. Output

Print the number of ways to write N as a sum of two positive integers.

### 4.4. Constraints

1 ≤ N ≤ 1000000000

### 4.5. Sample Input

```
10
```

### 4.6. Sample Output

```
4
```

### 4.7. Explanation

The four ways are:

10 = 1 + 9
10 = 2 + 8
10 = 3 + 7
10 = 4 + 6

### 4.8. Solution

```
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int N = sc.nextInt();
        int ans = 0;
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                ans++;
            }
        }
        pw.println(ans);
        pw.flush();
    }
}


