<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    static ArrayList<Long> fact = new ArrayList<>(Collections.nCopies(101, 1L));

    static long C(int a, int b) {
        return fact.get(a) / (fact.get(b) * fact.get(a - b));
    }

    static long sC(int a, int b) {
        long ret = 0;
        for (int i = Math.min(b, a - b) + 1; i >= 0; i--) {
            ret += C(b, i) * C(a - b, i);
        }
        return ret;
    }

    static ArrayList<String> calc(int n, int k) {
        if (n <= 0) {
            return new ArrayList<>();
        }
        int i = 0;
        while (Math.pow(2, i + 1) - 1 <= n) {
            i++;
        }

        ArrayList<String> ret = new ArrayList<>(Collections.nCopies(i + 1, String.valueOf(k)));
        int rem = n - ((int) Math.pow(2, i) - 1);
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
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for (int i = 1; i <= 100; i++) {
            fact.set(i, fact.get(i - 1) * i);
        }

        ArrayList<String> X = calc(N, 1);
        System.out.println(X.size());
        System.out.println(String.join(" ", X));
    }
}
```

This Java code does the same thing as your Python code. It calculates the factorial of numbers from 1 to 100 and then uses these factorials to calculate combinations. It then uses these combinations to calculate a sequence of numbers based on the input number. The result is printed to the standard output.
<|EOT|>
