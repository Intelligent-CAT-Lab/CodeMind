<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Arrays;
import java.util.Scanner;

class p03493 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        int marbles = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '1')marbles++;
        }
        System.out.println(marbles);
    }
}

```

### Response:
```python
import sys

def main():
    a = sys.stdin.readline().strip()
    marbles = sum(1 for i in a if i == '1')
    print(marbles)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from standard input, counts the number of '1's in the string, and then prints the count. The `sum` function is used to count the number of '1's, and the `for` loop is used to iterate over the string. The `if` condition inside the `for` loop checks if each character in the string is '1'. If it is, the `sum` function adds 1 to the count.
<|EOT|>
