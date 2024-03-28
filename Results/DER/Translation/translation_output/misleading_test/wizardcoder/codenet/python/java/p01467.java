Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
99 98 1

Expected output:
-79

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
```java
import java.util.*;

public class Main {
    public static int solve(int[] A, int[] B, int K, int i, int borrow) {
        if (i == -1) {
            int sum = 0;
            for (int j = 0; j < A.length; j++) {
                sum = sum * 10 + A[j];
            }
            return sum;
        }
        if (A[i] - borrow >= B[i]) {
            A[i] -= borrow + B[i];
            return solve(A, B, K, i - 1, 0);
        } else {
            A[i] -= borrow + 10 - B[i];
            if (K > 0) {
                int without = solve(A, B, K - 1, i - 1, 0);
                int with = solve(A, B, K, i - 1, 1);
                return Math.max(without, with);
            } else {
                return solve(A, B, K, i - 1, 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int[] A = new int[input.length];
        int[] B = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            A[i] = Integer.parseInt(input[i]);
        }
        input = sc.nextLine().split(" ");
        for (int i = 0; i < input.length; i++) {
            B[i] = Integer.parseInt(input[i]);
        }
        int K = sc.nextInt();
        int n = Math.max(A.length, B.length);
        B = Arrays.copyOf(B, n);
        int[] C = new int[n];
        System.out.println(solve(A, B, K, n - 1, 0));
    }
}
```<|endoftext|>
