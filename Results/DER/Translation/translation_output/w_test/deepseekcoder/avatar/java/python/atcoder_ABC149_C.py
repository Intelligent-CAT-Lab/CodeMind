<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
def is_prime(n):
    mid = n // 2
    for i in range(2, mid + 1):
        if n % i == 0:
            return False
    return True

def next_prime(n):
    prime = n
    while True:
        if is_prime(prime):
            return prime
        prime += 1

X = int(input())
print(next_prime(X))
```

This Python code does the same thing as the Java code. It checks if a number is prime by dividing it by all numbers up to its half. If it finds a number that divides evenly, it returns False, otherwise it returns True. The function next_prime finds the next prime number by incrementing the input number until it finds a prime number.
<|EOT|>
