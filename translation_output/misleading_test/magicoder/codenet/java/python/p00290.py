<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
20 2

Expected output:
116

```

import java.util.Scanner;

public class p00290 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(d*c);

    }
}


```

@@ Response
```python
# Python code

# Get input from user
d, c = map(int, input().split())

# Print the product of d and c
print(d*c)
```

You can run this code in any Python environment. Just replace the `input()` function with your test case.<｜end▁of▁sentence｜>
