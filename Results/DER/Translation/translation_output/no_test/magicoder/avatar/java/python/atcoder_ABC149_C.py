<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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
import sys

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

def main():
    X = int(sys.stdin.readline())
    prime = X
    while True:
        if is_prime(prime):
            break
        prime += 1
    print(prime)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It checks if a number is prime by dividing it by all numbers up to its square root. If the number is divisible by any of these numbers, it is not prime. If it is not divisible by any of these numbers, it is prime. The `is_prime` function is used to check if a number is prime. The `main` function reads the input, increments the number until it finds a prime number, and then prints it.<｜end▁of▁sentence｜>
