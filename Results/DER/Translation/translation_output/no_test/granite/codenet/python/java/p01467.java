System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
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


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] A = sc.next().split("");
        String[] B = sc.next().split("");
        int K = sc.nextInt();
        int n = A.length;
        B = new String[Math.max(0, n - B.length)] + B;
        int[] C = new int[n];
        System.out.println(solve(C, K, n - 1, 0));
    }

    public static int solve(int[] C, int K, int i, int borrow) {
        if (i == -1) {
            return Integer.parseInt(String.join("", Arrays.stream(C).mapToObj(String::valueOf).toArray(String[]::new)));
        }
        if (Integer.parseInt(A[i]) - borrow >= Integer.parseInt(B[i])) {
            C[i] = Integer.parseInt(A[i]) - borrow - Integer.parseInt(B[i]);
            return solve(C, K, i - 1, 0);
        } else {
            C[i] = Integer.parseInt(A[i]) - borrow + 10 - Integer.parseInt(B[i]);
            if (K > 0) {
                return Math.max(solve(C, K - 1, i - 1, 0), solve(C, K, i - 1, 1));
            } else {
                return solve(C, K, i - 1, 1);
            }
        }
    }
}
```<|endoftext|>
