<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02663 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h1 = nextInt(scanner);
        int m1 = nextInt(scanner);
        int h2 = nextInt(scanner);
        int m2 = nextInt(scanner);
        int k = nextInt(scanner);
        int h = h2 - h1;
        int m = m2 - m1;
        int day = (h * 60) + m;
        System.out.println(day - k);

    }

    public static int nextInt(Scanner scanner) {
        return Integer.parseInt(scanner.next());
    }
}

```

### Response:
```python
import sys

def next_int(scanner):
    return int(scanner.readline())

def main():
    scanner = sys.stdin
    h1 = next_int(scanner)
    m1 = next_int(scanner)
    h2 = next_int(scanner)
    m2 = next_int(scanner)
    k = next_int(scanner)
    h = h2 - h1
    m = m2 - m1
    day = (h * 60) + m
    print(day - k)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads four integers from the standard input (stdin), calculates the difference in minutes between two times, subtracts a given number of minutes, and prints the result. The `next_int` function is used to read an integer from the input. The `main` function is the entry point of the program.
<|EOT|>
