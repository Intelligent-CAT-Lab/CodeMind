<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
hihi

Expected output:
YMs

```
S = input() 
if (S == 'hi' or S == 'hihi' or S == 'hihihi' or S == 'hihihihi' or S == 'hihihihihi'):
  print('Yes')
else:
  print('No')
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();

        if (S.equals("hi") || S.equals("hihi") || S.equals("hihihi") || S.equals("hihihihi") || S.equals("hihihihihi")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

You can test this code with the following test input:

```
hihi
```

And it should output:

```
Yes
```<｜end▁of▁sentence｜>
