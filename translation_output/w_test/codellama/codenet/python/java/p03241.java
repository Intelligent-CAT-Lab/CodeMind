<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 14

Expected output:
2


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
[/INST]
```java
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int MN = M/N;
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
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisors[i] = i;
            }
        }
        return divisors;
    }
}
```
This is the Java code for the given Python code. The `makeDivisors` function is implemented in Java using an array to store the divisors of the input number. The `main` function is also implemented in Java, which reads the input from the user, calculates the value of `MN` and calls the `makeDivisors` function to get the divisors of `M`. The `maxGCD` variable is then used to store the maximum GCD of the divisors that are less than or equal to `MN`. Finally, the `maxGCD` variable is printed to the console.</s>
