<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p03737{
        public static void main(String[] args){
                try(Scanner sc = new Scanner(System.in)){
                        for(int i = 0; i < 3; i++){
                                System.out.print(Character.toUpperCase(sc.next().charAt(0)));
                        }
                        System.out.println("");
                }
        }
}
```

@@ Response
Here is the equivalent Python code:

```python
import sys

def main():
    for i in range(3):
        print(sys.stdin.read(1).upper(), end='')
    print()

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three characters from the standard input, converts them to uppercase, and prints them. The `sys.stdin.read(1)` function reads a single character from the standard input. The `upper()` function converts a character to uppercase. The `end=''` argument in the `print()` function is used to prevent a newline from being printed after each character.<｜end▁of▁sentence｜>
