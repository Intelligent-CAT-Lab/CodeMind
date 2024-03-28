Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
75 25

Expected output:
25

```
import java.util.*;

public class atcoder_ABC143_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        if A - (B * 2) > 0:
            system.out.println(A - (B * 2))
    }
}
```

### Response:
```python
import java.util.*;

public class atcoder_ABC143_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        if A - (B * 2) > 0:
            System.out.println(A - (B * 2));
    }
}
```

Explanation:

- We need to import the `java.util` package to use the `Scanner` class.
- We create a `Scanner` object to read input from the standard input stream.
- We read two integers `A` and `B` from the input stream using the `nextInt()` method of the `Scanner` class.
- We check if `A` is greater than or equal to `(B * 2)` using an `if` statement.
- If the condition is true, we print the difference between `A` and `(B * 2)` using the `println()` method of the `System.out` object.<|endoftext|>
