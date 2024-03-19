<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
BACD

Expected output:
&*s

```
S = input()
if S.count("AC") >= 1:
  print("Yes")
else:
  print("No")

```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        if (S.contains("AC")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

You can test this code with the following test input:

```
BACD
```

And it will output:

```
Yes
```<｜end▁of▁sentence｜>
