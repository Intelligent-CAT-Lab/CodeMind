<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3

Expected output:
2


```
def main():
    n = int(input())
    root = int(n ** (1 / 2)) + 1
    isPrime = [True] * (n + 3)
    for i in range(4, n + 3, 2):
        isPrime[i] = False
    
    ans = 0
    prePrime = -1
    for i in range(3, n + 3, 2):
        if isPrime[i]:
            if prePrime + 2 == i:
                ans += 2
                
            prePrime = i
            if i > root:
                continue
            for j in range(i * i, n + 3, i):
                isPrime[j] = False
    print(ans)

main()

```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int root = (int) Math.sqrt(n) + 1;
        boolean[] isPrime = new boolean[n + 3];
        for (int i = 0; i < n + 3; i++) {
            isPrime[i] = true;
        }

        int ans = 0;
        int prePrime = -1;
        for (int i = 3; i < n + 3; i += 2) {
            if (isPrime[i]) {
                if (prePrime + 2 == i) {
                    ans += 2;
                }
                prePrime = i;
                if (i > root) {
                    continue;
                }
                for (int j = i * i; j < n + 3; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It first reads an integer from the input, then it calculates the square root of that integer and sets it as the root. It then initializes an array of boolean values to represent whether each number up to `n + 3` is prime. It then iterates over each number from 3 to `n + 3`, marking multiples of each prime number as not prime. It also keeps track of the previous prime number and increments an answer variable if the current prime number and the previous prime number are two apart. Finally, it prints the answer.
<|EOT|>
