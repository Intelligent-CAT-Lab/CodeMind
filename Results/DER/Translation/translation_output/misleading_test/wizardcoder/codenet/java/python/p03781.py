Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
6

Expected output:
2

```
import java.util.Scanner;

public class p03781 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt(), i = 1;
        for (; i * (i + 1) / 2 < x; i++) {}
        System.out.println(i);
    }
}
```

### Response:
```python
import java.util.Scanner;

public class p03781 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt(), i = 1;
        while (i * (i + 1) / 2 < x):
            i += 1;
        System.out.println(i - 1);
    }
}
```

Explanation:

In Python, we can use a while loop instead of a for loop to achieve the same functionality. We can use the colon (:) to indicate the start of the loop body. The loop condition is enclosed in parentheses and ends with a colon. The loop body is indented. In this case, we use the += operator to increment the loop variable i by 1 in each iteration. Finally, we use the -1 operator to decrement the loop variable i by 1 to get the correct output.<|endoftext|>
