<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
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

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String N = scanner.next();

        char a = N.charAt(0);
        char b = N.charAt(1);
        char c = N.charAt(2);
        char d = N.charAt(3);

        if (a == b && b == c || b == c && c == d) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the user, then checks if the first three characters are the same or the last two characters are the same. If they are, it prints "Yes", otherwise it prints "No".<｜end▁of▁sentence｜>
