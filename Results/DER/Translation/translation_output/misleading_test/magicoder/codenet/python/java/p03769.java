<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
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

@@ Response
Here is the Java version of the provided Python code:

```java
import java.util.*;

public class Main {
    static long[] fact = new long[101];

    static long C(int a, int b) {
        return fact[a] / (fact[b] * fact[a - b]);
    }

    static long sC(int a, int b) {
        long ret = 0;
        for (int i = Math.min(b, a - b) + 1; i >= 0; i--) {
            ret += C(b, i) * C(a - b, i);
        }
        return ret;
    }

    static List<String> calc(int n, int k) {
        if (n <= 0) {
            return new ArrayList<>();
        }
        int i = 0;
        while ((1 << (i + 1)) - 1 <= n) {
            i++;
        }

        List<String> ret = new ArrayList<>(Collections.nCopies(i + 1, String.valueOf(k)));
        int rem = n - ((1 << i) - 1);
        int kk = k + 1;
        i++;
        int j = i / 2;

        while (j > 0) {
            while (true) {
                long tmp = sC(i, j);
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
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        fact[0] = 1;
        for (int i = 1; i <= 100; i++) {
            fact[i] = fact[i - 1] * i;
        }

        List<String> X = calc(N, 1);
        System.out.println(X.size());
        System.out.println(String.join(" ", X));
    }
}
```

This Java code does the same thing as the Python code. It calculates the factorial of numbers from 0 to 100 and then uses these factorials to calculate combinations (C) and combinations with repetition (sC). It then uses these combinations to calculate the result. The result is a list of strings, where each string is a number. The length of this list is the number of numbers in the result, and the numbers are the numbers in the result.<｜end▁of▁sentence｜>
