<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

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

Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;

public class Divisors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int MN = M / N;
        int[] divisors = makeDivisors(M);
        int maxGCD = 0;
        for (int d : divisors) {
            if (d <= MN && d >= maxGCD) {
                maxGCD = d;
            }
        }
        System.out.println(maxGCD);
    }

    public static int[] makeDivisors(int n) {
        int[] divisors = new int[n];
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                divisors[i] = i;
                if (i != n / i) {
                    divisors[n / i] = n / i;
                }
            }
        }
        return divisors;
    }
}
```
Note that the Java code uses the `Scanner` class to read input from the user, and the `System.out.println()` method to print output to the console. The `makeDivisors()` method is similar to the Python code, but it returns an array of integers instead of a list. The `main()` method is similar to the Python code, but it uses the `Scanner` class to read input from the user and the `System.out.println()` method to print output to the console.</s>
