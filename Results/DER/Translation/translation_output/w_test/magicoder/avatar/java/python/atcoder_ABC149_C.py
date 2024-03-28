<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
9552

Expected output:
9587


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
    if n == 2 or n == 3: return True
    if n < 2 or n%2 == 0: return False
    if n < 9: return True
    if n%3 == 0: return False
    r = int(n**0.5)
    f = 5
    while f <= r:
        if n%f == 0: return False
        if n%(f+2) == 0: return False
        f +=6
    return True

def next_prime(n):
    while True:
        n += 1
        if is_prime(n):
            return n

X = int(input())
print(next_prime(X))
```

This Python code does the same thing as the Java code. It first checks if a number is prime, then finds the next prime number after the input number. The `is_prime` function checks if a number is prime by checking if it is divisible by any number up to its square root. The `next_prime` function increments the input number until it finds a prime number.<｜end▁of▁sentence｜>
