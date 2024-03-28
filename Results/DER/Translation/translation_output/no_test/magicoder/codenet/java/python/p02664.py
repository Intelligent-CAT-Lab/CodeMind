<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02664 {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        char[] c = sc.next().toCharArray();
        int count = 0;
        for (int i = 0 ; i < c.length ; i++) {
            if (c[i] == 'D' ||c[i]  ==  '?') {
                count++;
                c[i] = 'D';
            }
            System.out.print(c[i]);
        }
        System.out.print("\n");

    }

}
```

@@ Response
Here is the equivalent Python code:

```python
import sys

def main():
    c = list(sys.stdin.readline().strip())
    count = 0
    for i in range(len(c)):
        if c[i] == 'D' or c[i] == '?':
            count += 1
            c[i] = 'D'
        print(c[i], end='')
    print()

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a line of input, converts it to a list of characters, and then iterates over the list. If the character is 'D' or '?', it increments a counter and replaces the character with 'D'. Finally, it prints the modified list of characters.<｜end▁of▁sentence｜>
