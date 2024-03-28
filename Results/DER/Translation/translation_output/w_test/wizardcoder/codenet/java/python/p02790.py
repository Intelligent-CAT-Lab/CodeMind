Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 3

Expected output:
3333


```
import java.util.Scanner;

public class p02790 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a >= b)
            for (int i = 0; i < a; i++)
                System.out.print(b);
        else
            for (int i = 0; i < b; i++)
                System.out.print(a);

    }
}

```

### Response:
```python
a, b = map(int, input().split())

if a >= b:
    for i in range(a):
        print(b, end="")
else:
    for i in range(b):
        print(a, end="")
```

Explanation:

- We first take input from the user using the `input()` function and split it into two variables `a` and `b` using the `split()` function.
- We then check if `a` is greater than or equal to `b`. If it is, we use a `for` loop to print `b` `a` number of times.
- If `a` is less than `b`, we use another `for` loop to print `a` `b` number of times.
- We use the `end` parameter in the `print()` function to print the numbers without a newline character at the end.<|endoftext|>
