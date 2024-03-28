Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
8 13

Expected output:
98

```
import java.util.Scanner;

class p03328 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int n = b - a;
    System.out.println(n * (n + 1) / 2 - b);
  }
}

```

### Response:
```python
import java.util.Scanner;

class p03328:
    def main(self):
        scanner = Scanner(System.in)
        a = scanner.nextInt()
        b = scanner.nextInt()
        n = b - a
        print(n * (n + 1) // 2 - b)

p03328().main()
```

Explanation:

- We first import the `java.util.Scanner` class to read input from the user.
- We define a class `p03328` which contains a method `main` which reads two integers `a` and `b` from the user using the `Scanner` class.
- We calculate the difference between `b` and `a` and store it in the variable `n`.
- We calculate the sum of the first `n` natural numbers using the formula `(n * (n + 1)) / 2`.
- We subtract `b` from the sum and print the result.<|endoftext|>
