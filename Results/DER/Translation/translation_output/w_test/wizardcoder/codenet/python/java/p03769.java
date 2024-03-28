Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
7

Expected output:
4
1 1 1 1


```
fact = [1]
for i in range(1, 101):
    fact.append(fact[-1]*i)
    
def C(a, b):
    return fact[a]//(fact[b]*fact[a-b])

def sC(a, b):
    ret = 0
    for i in range(min(b, a-b) + 1):
        ret += C(b, i) * C(a - b, i)
    return ret

def calc(n, k):
    if n<=0:
        return []
    i = 0
    while (1<<(i+1)) -1 <= n:
        i += 1
        
    ret = [str(k)] * (i+1)
    rem = n-((1<<i) - 1)
    kk = k + 1
    i += 1
    j = i // 2
    
    while j > 0:
        while True:
            tmp = sC(i, j)
            if tmp <= rem:
                ret.insert(j, str(kk))
                ret.append(str(kk))
                kk += 1
                rem -= tmp

            else:
                break
                
        j -= 1
        
    return ret + calc(rem, kk)

N = int(input())

X = calc(N, 1)
print(len(X))
print(" ".join(X))

```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<String> X = calc(N, 1);
        System.out.println(X.size());
        System.out.println(String.join(" ", X));
    }
    
    public static List<String> calc(int n, int k) {
        List<String> ret = new ArrayList<>();
        if (n <= 0) {
            return ret;
        }
        int i = 0;
        while ((1 << (i + 1)) - 1 <= n) {
            i++;
        }
        ret.addAll(Collections.nCopies(i + 1, String.valueOf(k)));
        int rem = n - ((1 << i) - 1);
        int kk = k + 1;
        i++;
        int j = i / 2;
        while (j > 0) {
            while (true) {
                int tmp = sC(i, j);
                if (tmp <= rem) {
                    ret.add(j, String.valueOf(kk));
                    ret.add(String.valueOf(kk));
                    kk++;
                    rem -= tmp;
                } else {
                    break;
                }
            }
            j--;
        }
        ret.addAll(calc(rem, kk));
        return ret;
    }
    
    public static int sC(int a, int b) {
        int ret = 1;
        for (int i = 1; i <= b; i++) {
            ret = ret * (a - b + i) / i;
        }
        return ret;
    }
}
```<|endoftext|>
