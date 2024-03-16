<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class atcoder_ABC051_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(",");
        
        String a = scanner.next();
        String b = scanner.next();
        String c = scanner.next();
        
        System.out.println(a + " " + b + " " + c);
    }
}
```

@@ Response
```python
import sys

def main():
    a, b, c = input().split()
    print(a, b, c)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three strings from the input, separated by spaces, and then prints them out. The `input().split()` function splits the input string into a list of strings, where each string is a word in the input. The `print()` function then prints out each string in the list, separated by spaces.<｜end▁of▁sentence｜>
