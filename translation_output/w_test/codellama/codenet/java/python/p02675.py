<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
16

Expected output:
pon


```
import java.util.*;
import java.lang.*;
import java.io.*;

public class p02675 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        switch(N%10){
            case 2:
            case 4:
            case 5:
            case 7:
            case 9:
              System.out.println("hon");
              break;
            case 0:
            case 1:
            case 6:
            case 8:
              System.out.println("pon");
              break;
            case 3:
              System.out.println("bon");
              break;
        }
    }
}

```
[/INST]
```python
import sys

def main():
    N = int(sys.stdin.readline().strip())

    if N % 10 in [2, 4, 5, 7, 9]:
        print("hon")
    elif N % 10 in [0, 1, 6, 8]:
        print("pon")
    elif N % 10 == 3:
        print("bon")

if __name__ == "__main__":
    main()
```

Explanation:

* The `sys` module is used to read input from stdin.
* The `int()` function is used to convert the input string to an integer.
* The `strip()` method is used to remove any leading or trailing whitespace from the input string.
* The `if` statement is used to check the value of `N % 10` and print the appropriate string.
* The `elif` statement is used to check for the values of `N % 10` that are not in the first `if` statement.
* The `else` statement is not needed because the `if` and `elif` statements cover all possible values of `N % 10`.
* The `print()` function is used to print the output.

Note: The `if` statement can be simplified by using the `in` operator instead of multiple `elif` statements.</s>
