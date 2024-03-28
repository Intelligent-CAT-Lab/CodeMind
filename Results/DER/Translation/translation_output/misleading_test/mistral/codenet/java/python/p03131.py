<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 2 6

Expected output:
-65

```
import java.util.*;

public class p03131{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        long K = sc.nextLong();
        long A = sc.nextLong();
        long B = sc.nextLong();
        sc.close();

        long sum = 1+K;
        if(A < B){
            long sum1 = 1;
            if(A > sum1){
                K -= (A-sum1);
                sum1 = A;
            }
            sum1 += (B-A)*(K/2);
            if(K%2 == 1)
                sum1 += 1;
            sum = Math.max(sum, sum1);
        }
        System.out.println(sum);
   }
}
```
[/INST]
```python
K = int(input())
A = int(input())
B = int(input())

sum = 1 + K
if A < B:
    sum1 = 1
    if A > sum1:
        K -= (A - sum1)
        sum1 = A
    sum1 += (B - A) * (K // 2)
    if K % 2 == 1:
        sum1 += 1
    sum = max(sum, sum1)

print(sum)
```</s>
