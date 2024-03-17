<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
99 98 1

Expected output:
1


```
def solve(C,K,i,borrow):
	if i == -1:
		return int("".join(map(str,C)))
	if A[i] - borrow >= B[i]:
		C[i] = A[i] - borrow - B[i]
		return solve(C,K,i-1,0)
	else:
		C[i] = A[i] - borrow + 10 - B[i]
		if K > 0:
			return max(solve(C,K-1,i-1,0),solve(C,K,i-1,1))
		else:
			return solve(C,K,i-1,1)

A,B,K = raw_input().split()
A,B,K = [int(i) for i in A],[int(i) for i in B],int(K)
n = len(A)
B = [0] * max(0, n - len(B)) + B
C = [0] * n
print solve(C,K,n-1,0)
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] A = scanner.nextLine().split(" ");
        String[] B = scanner.nextLine().split(" ");
        int K = scanner.nextInt();
        scanner.nextLine();

        int[] a = new int[A.length];
        int[] b = new int[B.length];
        int[] c = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            a[i] = Integer.parseInt(A[i]);
        }

        for (int i = 0; i < B.length; i++) {
            b[i] = Integer.parseInt(B[i]);
        }

        int n = a.length;
        b = Arrays.copyOf(b, Math.max(0, n - b.length));
        c = new int[n];

        System.out.println(solve(c, K, n - 1, 0, a, b));
    }

    public static int solve(int[] C, int K, int i, int borrow, int[] A, int[] B) {
        if (i == -1) {
            return Integer.parseInt(Arrays.toString(C).replaceAll("[\\[\\],]", ""));
        }

        if (A[i] - borrow >= B[i]) {
            C[i] = A[i] - borrow - B[i];
            return solve(C, K, i - 1, 0, A, B);
        } else {
            C[i] = A[i] - borrow + 10 - B[i];
            if (K > 0) {
                return Math.max(solve(C, K - 1, i - 1, 0, A, B), solve(C, K, i - 1, 1, A, B));
            } else {
                return solve(C, K, i - 1, 1, A, B);
            }
        }
    }
}
```

This Java code does the same thing as the Python code. It reads input, converts it to the appropriate data types, and then calls the `solve` function. The `solve` function is a recursive function that performs the same operations as the Python code.<｜end▁of▁sentence｜>
