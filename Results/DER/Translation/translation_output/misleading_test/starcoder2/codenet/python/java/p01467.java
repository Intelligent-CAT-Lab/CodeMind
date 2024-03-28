
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int[] A = new int[input[0].length()];
        int[] B = new int[input[1].length()];
        int K = Integer.parseInt(input[2]);
        for (int i = 0; i < input[0].length(); i++) {
            A[i] = input[0].charAt(i) - '0';
        }
        for (int i = 0; i < input[1].length(); i++) {
            B[i] = input[1].charAt(i) - '0';
        }
        int[] C = new int[A.length];
        System.out.println(solve(A, B, K, A.length - 1, 0));
    }

    public static int solve(int[] A, int[] B, int K, int i, int borrow) {
        if (i == -1) {
            return Integer.parseInt(Arrays.toString(A).replaceAll("[^0-9]", ""));
        }
        if (A[i] - borrow >= B[i]) {
            C[i] = A[i] - borrow - B[i];
            return solve(C, K, i - 1, 0);
        } else {
            C[i] = A[i] - borrow + 10 - B[i];
            if (K > 0) {
                return Math.max(solve(C, K - 1, i - 1, 0), solve(C, K, i - 1, 1));
            } else {
                return solve(C, K, i - 1, 1);
            }
        }
    }
}
```

## 2.

### 2.1

```
def solve(A,B,i):
    if i == -1:
        return 0
    if A[i] == B[i]:
        return solve(A,B,i-1)
    else:
        return 1 + solve(A,B,i-1)

A,B = raw_input().split()
A,B = [int(i) for i in A],[int(i) for i in B]
n = len(A)
B = [0] * max(0, n - len(B)) + B
print solve(A,B,n-1)
```

java code:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int[] A = new int[input[0].length()];
        int[] B = new int[input[1].length()];
        for (int i = 0; i < input[0].length(); i++) {
            A[i] = input[0].charAt(i) - '0';
        }
        for (int i = 0; i < input[1].length(); i++) {
            B[i] = input[1].charAt(i) - '0';
        }
        System.out.println(solve(A, B, A.length - 1));
    }

    public static int solve(int[] A, int[] B, int i) {
        if (i == -1) {
            return 0;
        }
        if (A[i] == B[i]) {
            return solve(A, B, i - 1);
        } else {
            return 1 + solve(A, B, i - 1);
        }
    }
}
```

### 2.2

```
def solve(A,B,i):
    if i == -1:
        return 0
    if A[i] == B[i]:
        return solve(A,B,i-1)
    else:
        return 1 + solve(A,B,i-1)

A,B = raw_input().split()
A,B = [int(i) for i in A],[int(i) for i in B]
n = len(A)
B = [0] * max(0, n - len(B)) + B
print solve(A,B,n-1)
```

java code:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int[] A = new int[input[0].length()];
        int[] B = new int[input[1].length()];
        for (int i = 0; i < input[0].length(); i++) {
            A[i] = input[0].charAt(i) - '0';
        }
        for (int i = 0; i < input[1].length(); i++) {
            B[i] = input[1].charAt(i) - '0';
        }
        System.out.println(solve(A, B, A.length - 1));
    }

    public static int solve(int[] A, int[] B, int i) {
        if (i == -1) {
            return 0;
        }
        if (A[i] == B[i]) {
            return solve(A, B, i - 1);
        } else {
            return 1 + solve(A, B, i - 1);
        }
    }
}
```

### 2.3

```
def solve(A,B,i):
    if i == -1:
        return 0
    if A[i] == B[i]:
        return solve(A,B,i-1)
    else:
        return 1 + solve(A,B,i-1)

A,B = raw_input().split()
A,B = [int(i) for i in A],[int(i) for i in B]
n = len(A)
B = [0] * max(0, n - len(B)) + B
print solve(A,B,n-1)
```

java code:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int[] A = new int[input[0].length()];
        int[] B = new int[input[1].length()];
        for (int i = 0; i < input[0].length(); i++) {
            A[i] = input[0].charAt(i) - '0';
        }
        for (int i = 0; i < input[1].length(); i++) {
            B[i] = input[1].charAt(i) - '0';
        }
        System.out.println(solve(A, B, A.length - 1));
    }

    public static int solve(int[] A, int[] B, int i) {
        if (i == -1) {
            return 0;
        }
        if (A[i] == B[i]) {
            return solve(A, B, i - 1);
        } else {
            return 1 + solve(A, B, i - 1);
        }
    }
}
```

### 2.4

```
def solve(A,B,i):
    if i == -1:
        return 0

