Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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
- We define a class `p03328` which contains a method `main` which is the entry point of the program.
- Inside the `main` method, we create an instance of the `Scanner` class and read two integers `a` and `b` from the user using the `nextInt()` method.
- We calculate the difference between `b` and `a` and store it in the variable `n`.
- We use the formula `(n * (n + 1) / 2)` to calculate the sum of the first `n` natural numbers and store it in the variable `sum`.
- Finally, we print the difference between `sum` and `b` using the `println()` method of the `System.out` object.<|endoftext|>
