<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
68

Expected output:
19


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

def main():
    a = int(input())
    print((a - 30) // 2)

if __name__ == "__main__":
    main()
```

In this Python code, we use the `input()` function to get the input from the user. The `//` operator is used for integer division in Python, which is equivalent to the `/` operator in Java but rounds down to the nearest whole number.<｜end▁of▁sentence｜>
