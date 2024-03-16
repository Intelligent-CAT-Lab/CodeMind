<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
public class p00354 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("thu:fri:sat:sun:mon:tue:wed".split(":")[sc.nextInt()%7]);
    }
}

```

@@ Response
Here is the equivalent Python code:

```python
import sys

def main():
    days = "thu:fri:sat:sun:mon:tue:wed".split(":")
    day_index = int(input()) % 7
    print(days[day_index])

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, calculates the remainder when divided by 7, and then prints the corresponding day of the week.<｜end▁of▁sentence｜>
