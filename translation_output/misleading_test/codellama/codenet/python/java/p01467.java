<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

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
[/INST]
```java
public static int solve(int[] A, int[] B, int K) {
    int n = A.length;
    int[] C = new int[n];
    return solve(A, B, C, K, n - 1, 0);
}

private static int solve(int[] A, int[] B, int[] C, int K, int i, int borrow) {
    if (i == -1) {
        return Integer.parseInt(Arrays.toString(C).replaceAll("[\\[\\]]", ""));
    }
    if (A[i] - borrow >= B[i]) {
        C[i] = A[i] - borrow - B[i];
        return solve(A, B, C, K, i - 1, 0);
    } else {
        C[i] = A[i] - borrow + 10 - B[i];
        if (K > 0) {
            return Math.max(solve(A, B, C, K - 1, i - 1, 0), solve(A, B, C, K, i - 1, 1));
        } else {
            return solve(A, B, C, K, i - 1, 1);
        }
    }
}
```
This is a recursive solution to the problem. The `solve` function takes in the arrays `A`, `B`, and `C`, the integer `K`, and the index `i` of the current element being processed. It returns the maximum value that can be obtained by subtracting the elements of `B` from the elements of `A`, subject to the constraint that the elements of `C` are non-negative and the sum of the elements of `C` is less than or equal to `K`.

The function first checks if `i` is equal to `-1`, which means that all elements of `A` have been processed. If this is the case, it returns the sum of the elements of `C` converted to a string and then parsed back into an integer.

Otherwise, the function checks if `A[i] - borrow >= B[i]`. If this is the case, it sets `C[i]` to `A[i] - borrow - B[i]` and recursively calls `solve` with `i - 1` and `borrow = 0`. This means that the current element of `A` is subtracted from the current element of `B`, and the result is stored in `C`.

If `A[i] - borrow < B[i]`, it sets `C[i]` to `A[i] - borrow + 10 - B[i]`. This means that the current element of `A` is subtracted from the current element of `B`, and the result is stored in `C`. If `K > 0`, it recursively calls `solve` with `i - 1`, `borrow = 0`, and `K - 1`. This means that the current element of `A` is subtracted from the current element of `B`, and the result is stored in `C`, and the function returns the maximum value that can be obtained by subtracting the elements of `B` from the elements of `A`, subject to the constraint that the elements of `C` are non-negative and the sum of the elements of `C` is less than or equal to `K - 1`.

If `K = 0`, it recursively calls `solve` with `i - 1` and `borrow = 1`. This means that the current element of `A` is subtracted from the current element of `B`, and the result is stored in `C`, and the function returns the maximum value that can be obtained by subtracting the elements of `B` from the elements of `A`, subject to the constraint that the elements of `C` are non-negative and the sum of the elements of `C` is less than or equal to `K`.

The function returns the maximum value obtained by any of the recursive calls.</s>
