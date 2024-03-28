<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
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

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];
        for(int i=0;i<n;i++) A[i] = sc.nextInt();
        for(int i=0;i<n;i++) B[i] = sc.nextInt();
        int[] C = new int[n];
        System.out.println(solve(A,B,C,n,k));
    }
    public static int solve(int[] A,int[] B,int[] C,int n,int k){
        if(n==0) return 0;
        if(A[n-1]-C[n-1]>=B[n-1]) C[n-1] = A[n-1]-C[n-1]-B[n-1];
        else{
            C[n-1] = A[n-1]-C[n-1]+10-B[n-1];
            if(k>0) return Math.max(solve(A,B,C,n-1,k-1),solve(A,B,C,n-1,k));
            else return solve(A,B,C,n-1,1);
        }
        return solve(A,B,C,n-1,k);
    }
}
```
<|endoftext|>
