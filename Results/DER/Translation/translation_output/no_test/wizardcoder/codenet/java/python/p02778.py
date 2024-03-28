Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02778 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        for (int i = 0; i < s.length(); i++) {
            System.out.print("x");
        }

    }
}
```

### Response:
```python
import java.util.Scanner;

public class p02778 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        for i in range(s.length()):
            print("x", end="")

    }
}
```

Explanation:

- We first import the `java.util.Scanner` package in python.
- We create a `Scanner` object to read input from the user.
- We read the input string from the user using the `next()` method of the `Scanner` object.
- We use a `for` loop to iterate over the length of the input string.
- Inside the loop, we use the `print()` function to print the character "x" to the console. We also use the `end` parameter of the `print()` function to prevent the `print()` function from adding a newline character at the end of each output.<|endoftext|>
