<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
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
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int[] A = new int[input.length];
        int[] B = new int[input.length];
        int K = Integer.parseInt(input[2]);
        for (int i = 0; i < input.length; i++) {
            A[i] = Integer.parseInt(input[i]);
        }
        for (int i = 0; i < input.length; i++) {
            B[i] = Integer.parseInt(input[i]);
        }
        int n = A.length;
        B = new int[Math.max(0, n - B.length) + B.length];
        Arrays.fill(C, 0, n, 0);
        System.out.println(solve(C, K, n - 1, 0));
    }

    public static int solve(int[] C, int K, int i, int borrow) {
        if (i == -1) {
            return Integer.parseInt(String.valueOf(C));
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

    int[] A;
    int[] B;
    int K;
}
```</s>
