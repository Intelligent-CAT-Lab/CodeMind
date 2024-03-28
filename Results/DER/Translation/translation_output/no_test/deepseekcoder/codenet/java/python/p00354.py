<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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
    day_number = int(input()) % 7
    print(days[day_number])

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It splits the string "thu:fri:sat:sun:mon:tue:wed" into a list of days of the week, then it takes an input number, finds the remainder when divided by 7, and uses this as the index to print the corresponding day of the week from the list.
<|EOT|>
