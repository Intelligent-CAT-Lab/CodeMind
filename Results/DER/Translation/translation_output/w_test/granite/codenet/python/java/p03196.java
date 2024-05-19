System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 24

Expected output:
2


```
n,p=map(int,input().split())

def factorization(n):
    arr = []
    temp = n
    for i in range(2, int(-(-n**0.5//1))+1):
        if temp%i==0:
            cnt=0
            while temp%i==0:
                cnt+=1
                temp //= i
            arr.append([i, cnt])

    if temp!=1:
        arr.append([temp, 1])

    if arr==[]:
        arr.append([n, 1])

    return arr

l=factorization(p)
ans=1
for i in range(len(l)):
    if l[i][1]>=n:
        ans*=l[i][0]**(l[i][1]//n)
print(ans)

```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        List<List<Integer>> factors = factorization(p);
        int ans = 1;
        for (List<Integer> factor : factors) {
            int count = factor.get(1);
            while (count >= n) {
                ans *= Math.pow(factor.get(0), count / n);
                count -= n;
            }
        }
        System.out.println(ans);
    }

    public static List<List<Integer>> factorization(int n) {
        List<List<Integer>> factors = new ArrayList<>();
        int temp = n;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (temp % i == 0) {
                int count = 0;
                while (temp % i == 0) {
                    count++;
                    temp /= i;
                }
                factors.add(Arrays.asList(i, count));
            }
        }
        if (temp!= 1) {
            factors.add(Arrays.asList(temp, 1));
        }
        if (factors.isEmpty()) {
            factors.add(Arrays.asList(n, 1));
        }
        return factors;
    }
}
```

Test input:
```
3 24
```

Expected output:
```
2
```<|endoftext|>
