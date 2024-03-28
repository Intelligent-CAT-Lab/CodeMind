Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
import java.util.*;

public class Main {
    public static final int MOD = 1000000007;

    public static int sum(int a, int d, int n) {
        return n * (2 * a + (n - 1) * d) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int s = 0;
        if (n == 1) {
            s = m + 1;
        } else {
            s = sum(m + 1, -n + 1, 1 + m / (n - 1));
            s *= 2;
            s -= (m + 1);
        }

        System.out.println(s % MOD);
    }
}
```<|endoftext|>
