<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02111 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int minute = 12 * 60 * n / 360;
        System.out.println((minute / 60) + " " + (minute % 60));
    }
}

```

### Response:
```python
import sys

def main():
    n = int(sys.stdin.readline())
    minute = (12 * 60 * n) // 360
    print(minute // 60, minute % 60)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, calculates the number of minutes in 12 hours times the input integer, and then prints the number of hours and minutes. The `//` operator is used for integer division, which discards the fractional part. The `%` operator is used to calculate the remainder of the division.
<|EOT|>
