<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```

import java.util.Scanner;

class p00375
{

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println((a - 30) / 2);
    }

}


```

@@ Response
```python
# Python code

# importing the built-in module for input
import sys

# reading input from the user
a = int(sys.stdin.readline())

# printing the result
print((a - 30) // 2)
```

In Python, we don't need to import any specific module for input. We can use the built-in `sys.stdin.readline()` function to read input from the user. The `//` operator is used for integer division in Python.<｜end▁of▁sentence｜>
