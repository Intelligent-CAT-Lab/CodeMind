<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
MOD = 10**9+7

def sum(a,d,n):
    return n*(2*a+(n-1)*d)//2

def main():
    n,m = map(int,input().split())

    s = 0
    if n == 1:
        s = m+1
    else:
        s = sum(m+1,-n+1,1+m//(n-1))
        s *= 2
        s -= (m+1)

    print(s%MOD)

if __name__ == '__main__':
    main()
```

### Response:
```java
public class Main {
    static final long MOD = (long) Math.pow(10,9)+7;

    static long sum(long a, long d, long n) {
        return n*(2*a+(n-1)*d) / 2;
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();

        long s = 0;
        if (n == 1) {
            s = m+1;
        } else {
            s = sum(m+1,-n+1,1+m/(n-1));
            s *= 2;
            s -= (m+1);
        }

        System.out.println(s%MOD);
    }
}
```

Please note that in Java, the division operator `/` performs integer division when both operands are integers. So, we need to use `(long) Math.pow(10,9)+7` instead of `10**9+7` to avoid integer overflow. Also, the `//` operator in Python is equivalent to `/` in Java for integer division.
<|EOT|>
