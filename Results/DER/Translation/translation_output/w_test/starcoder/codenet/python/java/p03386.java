<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 8 2

Expected output:
3
4
7
8


```
A,B,K=map(int,input().split())
X = [p for p in range(A,A+K) if p<=B]
Y = [q for q in range(B-K+1,B+1) if q>=A]
ans = list(set(X+Y))
ans.sort()
for i in ans:
  print(i)
```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int K = sc.nextInt();
        int[] X = new int[K];
        int[] Y = new int[K];
        for(int i=0;i<K;i++){
            X[i] = A+i;
            Y[i] = B-i;
        }
        Arrays.sort(X);
        Arrays.sort(Y);
        for(int i=0;i<K;i++){
            System.out.println(X[i]);
            System.out.println(Y[i]);
        }
    }
}
```
<|endoftext|>
