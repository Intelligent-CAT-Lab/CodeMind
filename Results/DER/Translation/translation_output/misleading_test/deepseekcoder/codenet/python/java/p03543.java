<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1118

Expected output:
Yev

```
def main():
    N = input()

    a, b, c, d = list(N)
    if a == b == c or b == c == d:
        print("Yes")
    else:
        print("No")

if __name__ == '__main__':
    main()

```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String N = scanner.next();
        char[] digits = N.toCharArray();

        if (digits[0] == digits[1] && digits[1] == digits[2]) {
            System.out.println("Yes");
        } else if (digits[1] == digits[2] && digits[2] == digits[3]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the input, converts it to a character array, and then checks if the first three or last three characters are the same. If they are, it prints "Yes", otherwise it prints "No".
<|EOT|>
