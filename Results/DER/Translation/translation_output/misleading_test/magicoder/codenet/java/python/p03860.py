<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
AtCoder Beginner Contest

Expected output:
ABC

```
import java.util.Scanner;

public class p03860 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] lines = sc.nextLine().split(" ");
        char upper = lines[1].charAt(0);
        System.out.println("A" + upper +"C");
    }
}
```

@@ Response
```python
import sys

def main():
    lines = sys.stdin.readline().split()
    upper = lines[1][0]
    print("A" + upper + "C")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a line from the standard input, splits it into words, and then prints the first character of the second word (which is the uppercase letter in the problem statement) followed by "AC".<｜end▁of▁sentence｜>
