<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p00331 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int H = sc.nextInt();
            int R = sc.nextInt();

            if ( H < 0 && Math.abs(H) == R ) {
                System.out.println(0);
            } else if ( H + R > 0 ) {
                System.out.println(1);
            } else {
                System.out.println(-1);
            }
        }
    }
}


```

### Response:
```python
while True:
    try:
        H = int(input())
        R = int(input())

        if H < 0 and abs(H) == R:
            print(0)
        elif H + R > 0:
            print(1)
        else:
            print(-1)
    except ValueError:
        break
```

This Python code does the same thing as the Java code. It reads integers from the standard input and checks if they satisfy certain conditions. If the input is not an integer, it breaks the loop and ends the program.
<|EOT|>
