<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
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

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];
        int k = sc.nextInt();
        for(int i=0;i<n;i++) A[i] = sc.nextInt();
        for(int i=0;i<n;i++) B[i] = sc.nextInt();
        System.out.println(solve(A,B,k));
    }
    public static int solve(int[] A,int[] B,int k){
        int n = A.length;
        int[] C = new int[n];
        return solve(A,B,C,k,n-1,0);
    }
    public static int solve(int[] A,int[] B,int[] C,int k,int i,int borrow){
        if(i == -1) return toInt(C);
        if(A[i] - borrow >= B[i]) {
            C[i] = A[i] - borrow - B[i];
            return solve(A,B,C,k,i-1,0);
        } else {
            C[i] = A[i] - borrow + 10 - B[i];
            if(k > 0) return Math.max(solve(A,B,C,k-1,i-1,0),solve(A,B,C,k,i-1,1));
            else return solve(A,B,C,k,i-1,1);
        }
    }
    public static int toInt(int[] A) {
        int ans = 0;
        for(int i=0;i<A.length;i++) ans = ans * 10 + A[i];
        return ans;
    }
}
```
<|endoftext|>
