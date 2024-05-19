System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
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


Answer:
```java
import java.util.*;

public class Main {
    static int[] fact = new int[101];
    static {
        fact[0] = 1;
        for (int i = 1; i < 101; i++) {
            fact[i] = fact[i-1] * i;
        }
    }
    
    static int C(int a, int b) {
        return fact[a] / (fact[b] * fact[a-b]);
    }
    
    static int sC(int a, int b) {
        int ret = 0;
        for (int i = 0; i <= Math.min(b, a-b); i++) {
            ret += C(b, i) * C(a - b, i);
        }
        return ret;
    }
    
    static List<String> calc(int n, int k) {
        if (n <= 0) {
            return new ArrayList<>();
        }
        
        int i = 0;
        while ((1 << (i+1)) - 1 <= n) {
            i++;
        }
        
        List<String> ret = new ArrayList<>();
        for (int j = 0; j <= i; j++) {
            ret.add(String.valueOf(k));
        }
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
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<String> X = calc(N, 1);
        System.out.println(X.size());
        System.out.println(String.join(" ", X));
    }
}
```<|endoftext|>
