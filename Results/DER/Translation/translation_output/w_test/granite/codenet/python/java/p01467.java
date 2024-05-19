System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
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


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] A = sc.next().split("");
        String[] B = sc.next().split("");
        int K = sc.nextInt();
        int n = Math.max(A.length, B.length);
        int[] C = new int[n];
        int borrow = 0;
        int i = n - 1;
        while (i >= 0) {
            int a = Integer.parseInt(A[i]);
            int b = Integer.parseInt(B[i]);
            if (a - borrow >= b) {
                C[i] = a - borrow - b;
                borrow = 0;
            } else {
                C[i] = a - borrow + 10 - b;
                borrow = 1;
            }
            i--;
        }
        int result = 0;
        for (int j = 0; j < n; j++) {
            result = result * 10 + C[j];
        }
        System.out.println(result);
    }
}
```<|endoftext|>
