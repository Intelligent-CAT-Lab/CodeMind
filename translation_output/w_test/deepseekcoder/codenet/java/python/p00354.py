<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1

Expected output:
fri


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
    days = "thu:fri:sat:sun:mon:tue:wed".split(":")
    n = int(input())
    print(days[n%7])

if __name__ == "__main__":
    main()
```

In this Python code, we first define the days of the week as a list of strings. Then we read an integer from the standard input. We use the modulo operator (%) to ensure that the index is within the range of the list. Finally, we print the corresponding day of the week.
<|EOT|>
