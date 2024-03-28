<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
9552

Expected output:
9513

```
import java.util.Scanner;

public class atcoder_ABC149_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int prime = X;
        int mid = prime / 2;
        boolean flag = false;
        
        while (true) {
            for (int i = 2; i <= mid; ++i) {
                if (prime % i == 0) {
                    flag = true;
                    break;
                }
            }
            
            if (!flag) {
                break;
            } else {
                flag = false;
            }
            
            prime++;
        }
        
        System.out.println(prime);
    }
}
```

@@ Response
```python
def is_prime(n):
    if n <= 1:
        return False
    if n == 2:
        return True
    if n % 2 == 0:
        return False
    i = 3
    while i * i <= n:
        if n % i == 0:
            return False
        i += 2
    return True

def next_prime(n):
    while True:
        n += 1
        if is_prime(n):
            return n

X = int(input())
print(next_prime(X))
```

This Python code does the same thing as the Java code. It first checks if a number is prime by iterating from 2 to the square root of the number. If the number is divisible by any of these numbers, it is not prime. If it is not divisible by any of these numbers, it is prime. Then it finds the next prime number by incrementing the input number and checking if it is prime.<｜end▁of▁sentence｜>
