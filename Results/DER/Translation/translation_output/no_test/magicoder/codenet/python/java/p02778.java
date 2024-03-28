<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
ni = lambda: int(input())
nm = lambda: map(int, input().split())
nl = lambda: list(map(int, input().split()))

s = input()

for i in range(len(s)):
  print('x',end='')
```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        for (int i = 0; i < s.length(); i++) {
            System.out.print('x');
        }
    }
}
```

In Java, we don't have lambda functions like Python. Instead, we use the `Scanner` class to get input from the user. The `for` loop is used to iterate over each character in the string. The `System.out.print('x')` statement is used to print 'x' to the console.<｜end▁of▁sentence｜>
