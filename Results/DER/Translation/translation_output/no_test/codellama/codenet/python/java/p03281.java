<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

n = int(input())

def cnt_divisor(n):
    cnt = 0
    for i in range(1, n+1):
        if n % i == 0:
            cnt += 1
    return cnt

cnt = 0
for j in range(1, n+1):
    if j % 2 == 0:
        continue
    if cnt_divisor(j) == 8:
        cnt += 1

print(cnt)


Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                continue;
            }
            if (cntDivisor(i) == 8) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }

    private static int cntDivisor(int n) {
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                cnt++;
            }
        }
        return cnt;
    }
}
```
Note that the `cntDivisor` method is a helper method that counts the number of divisors of a given number. It is called from the `main` method to count the number of divisors of each odd number less than or equal to `n`. The `main` method then prints the number of odd numbers with 8 divisors.</s>
