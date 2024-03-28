<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
ABA

Expected output:
Ye

```
S = str(input())

if S == 'AAA' or S == 'BBB':
    print('No')
else:
    print('Yes')
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();

        if (S.equals("AAA") || S.equals("BBB")) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
```

You can test this code with the following test input:

```
ABA
```

And the expected output will be:

```
Yes
```<｜end▁of▁sentence｜>
