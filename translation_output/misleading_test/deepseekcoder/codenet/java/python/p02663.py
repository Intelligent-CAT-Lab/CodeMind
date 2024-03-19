<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 0 15 0 30

Expected output:
191

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
def next_int(scanner):
    return int(scanner.next())

def main():
    scanner = input().split()
    h1 = next_int(scanner[0])
    m1 = next_int(scanner[1])
    h2 = next_int(scanner[2])
    m2 = next_int(scanner[3])
    k = next_int(scanner[4])
    h = h2 - h1
    m = m2 - m1
    day = (h * 60) + m
    print(day - k)

main()
```

In this Python code, the `next_int` function is used to parse the input as an integer. The `main` function reads the input, calculates the difference in minutes between the two times and subtracts the penalty time `k`. The result is printed out.
<|EOT|>
