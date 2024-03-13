<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
def make_divisors(n):
    divisors = []
    for i in range(1, int(n**0.5)+1):
        if n % i == 0:
            divisors.append(i)
            if i != n // i:
                divisors.append(n//i)

    # divisors.sort()
    return divisors

def main():
    N, M = map(int, input().split())
    MN = M/N
    divisor = make_divisors(M)
    max_gcd = 0
    for d in divisor:
        if (d<=MN) and (d>=max_gcd):
            max_gcd = d
    print(max_gcd)
if __name__ == '__main__':
    main()
```

@@ Response
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        double MN = (double) M / N;
        List<Integer> divisors = makeDivisors(M);
        int maxGcd = 0;
        for (int d : divisors) {
            if (d <= MN && d >= maxGcd) {
                maxGcd = d;
            }
        }
        System.out.println(maxGcd);
    }

    public static List<Integer> makeDivisors(int n) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                divisors.add(i);
                if (i != n / i) {
                    divisors.add(n / i);
                }
            }
        }
        Collections.sort(divisors);
        return divisors;
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the standard input, calculates the ratio of M to N, and then finds the largest divisor of M that is less than or equal to the ratio and greater than or equal to the current maximum GCD. The divisors are calculated using the `makeDivisors` method, which finds all divisors of a number. The divisors are sorted in ascending order before being returned.<｜end▁of▁sentence｜>
