<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class atcoder_AGC025_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();

        for (int i = 1; i < n.length(); i++) {
            if (n.charAt(i) != '0') {
                int sum = 0;
                for (int j = 0; j < n.length(); j++) {
                    sum += n.charAt(j) - '0';
                }
                System.out.println(sum);
                return;
            }
        }

        if (n.charAt(0) == '1') {
            System.out.println(10);
            return;
        }

        System.out.println(n.charAt(0));
    }
}
```

@@ Response
```python
import sys

def main():
    n = sys.stdin.readline().strip()

    for i in range(1, len(n)):
        if n[i] != '0':
            sum = 0
            for j in range(len(n)):
                sum += int(n[j])
            print(sum)
            return

    if n[0] == '1':
        print(10)
        return

    print(n[0])

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the standard input, then iterates over the string to find the first non-zero character. If it finds one, it calculates the sum of all digits in the string and prints it. If it doesn't find any non-zero characters, it checks if the first character is '1'. If it is, it prints 10. If the first character is not '1', it prints the first character.<｜end▁of▁sentence｜>
