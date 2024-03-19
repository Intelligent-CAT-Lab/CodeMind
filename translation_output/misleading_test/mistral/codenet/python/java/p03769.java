<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
7

Expected output:
4
1 1 1 1
30

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
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<String> X = calc(N, 1);
        System.out.println(X.size());
        System.out.println(X.stream().mapToInt(i -> Integer.parseInt(i)).sum());
    }

    public static List<String> calc(int N, int k) {
        List<String> fact = new ArrayList<>(Arrays.asList(1));
        for (int i = 1; i <= 100; i++) {
            fact.add(fact.get(fact.size() - 1) * i);
        }

        int C = fact.get(k);
        int sC = 0;
        for (int i = 1; i <= Math.min(k, N - k); i++) {
            sC += C * C;
        }

        List<String> ret = new ArrayList<>();
        int rem = N - ((1 << k) - 1);
        int kk = k + 1;
        int i = 1;
        while ((1 << (i + 1)) - 1 <= N) {
            i++;
        }

        ret.addAll(Arrays.asList(repeat(kk, rem)));
        kk++;
        i = 1;
        j = i / 2;

        while (j > 0) {
            List<String> tmp = new ArrayList<>();
            for (int jj = 0; jj < Math.min(i, j); jj++) {
                tmp.add(repeat(kk, jj));
            }
            ret.addAll(tmp);
            kk++;
            rem -= sC;
            j--;
        }

        return ret;
    }

    public static List<String> repeat(int k, int n) {
        List<String> ret = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ret.add(repeat(k, 1));
        }
        return ret;
    }

    public static String repeat(int k, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(k);
        }
        return sb.toString();
    }
}
```</s>
