Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

In Python, we can use a while loop instead of a for loop to achieve the same functionality. We can use the colon (:) to indicate the start of the loop body. The loop condition is enclosed in parentheses and ends with a colon. The loop body is indented. In this case, we use the += operator to increment i by 1 in each iteration of the loop. Finally, we use the -1 operator to decrement i by 1 to get the correct output.<|endoftext|>
