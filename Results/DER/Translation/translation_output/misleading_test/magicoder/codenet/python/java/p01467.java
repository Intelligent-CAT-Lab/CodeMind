<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] A = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
        input = scanner.nextLine().split(" ");
        int[] B = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
        int K = scanner.nextInt();
        int n = A.length;
        int[] C = new int[n];
        System.out.println(solve(C, K, n - 1, 0, A, B));
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

This Java code does the same thing as the Python code. It reads the input, converts it into arrays of integers, and then calls the `solve` function. The `solve` function is a recursive function that calculates the result. The `Math.max` function is used to find the maximum of two numbers. The `Arrays.toString` method is used to convert the array to a string, and the `replaceAll` method is used to remove the brackets and commas from the string. The `Integer.parseInt` method is used to convert the string to an integer.<｜end▁of▁sentence｜>
