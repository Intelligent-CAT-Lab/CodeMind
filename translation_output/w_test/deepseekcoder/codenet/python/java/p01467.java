<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] A = scanner.next().split(" ");
        String[] B = scanner.next().split(" ");
        int K = scanner.nextInt();
        int n = A.length;
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(A[i]);
            b[i] = Integer.parseInt(B[i]);
        }
        System.out.println(solve(c, K, n - 1, 0, a, b));
    }

    public static int solve(int[] C, int K, int i, int borrow, int[] A, int[] B) {
        if (i == -1) {
            return Integer.parseInt(Arrays.toString(C).replace("[", "").replace("]", "").replace(" ", ""));
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

This Java code does the same thing as the Python code. It reads the input, converts it to the appropriate data types, and then calls the `solve` function. The `solve` function is a recursive function that implements the logic of the Python code. It returns the final result as an integer.
<|EOT|>
