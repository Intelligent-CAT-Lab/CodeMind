<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static long[] fact = new long[101];

    static void calcFact() {
        fact[0] = 1;
        for (int i = 1; i <= 100; i++) {
            fact[i] = fact[i - 1] * i;
        }
    }

    static long C(int a, int b) {
        return fact[a] / (fact[b] * fact[a - b]);
    }

    static long sC(int a, int b) {
        long ret = 0;
        for (int i = 0; i <= Math.min(b, a - b); i++) {
            ret += C(b, i) * C(a - b, i);
        }
        return ret;
    }

    static List<String> calc(int n, int k) {
        List<String> ret = new ArrayList<>();
        if (n <= 0) {
            return ret;
        }
        int i = 0;
        while (Math.pow(2, i + 1) - 1 <= n) {
            i++;
        }
        for (int j = 0; j <= i; j++) {
            ret.add(String.valueOf(k));
        }
        int rem = n - ((int) Math.pow(2, i)) + 1;
        int kk = k + 1;
        int j = i / 2;
        while (j > 0) {
            while (true) {
                long tmp = sC(i + 1, j);
                if (tmp <= rem) {
                    ret.add(j, String.valueOf(kk));
                    ret.add(String.valueOf(kk));
                    kk += 1;
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
        calcFact();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<String> X = calc(N, 1);
        System.out.println(X.size());
        System.out.println(String.join(" ", X));
    }
}
```

This Java code does the same thing as the Python code. It calculates the factorial of numbers from 1 to 100 and stores them in an array. It then uses these factorials to calculate combinations and to calculate the sum of combinations. The `calc` function is used to calculate the result. The result is then printed to the console.
<|EOT|>
