<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1

Expected output:
fr

```
import java.util.Scanner;
public class p00354 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("thu:fri:sat:sun:mon:tue:wed".split(":")[sc.nextInt()%7]);
    }
}

```

### Response:
```python
def main():
    days = ["thu", "fri", "sat", "sun", "mon", "tue", "wed"]
    n = int(input())
    print(days[n%7])

if __name__ == "__main__":
    main()
```

In this Python code, we first define a list of days of the week. Then we take an integer input `n`. We use the modulo operator `%` to find the remainder of `n` divided by 7, which will be in the range 0 to 6. We use this index to print the corresponding day of the week from the `days` list.
<|EOT|>
