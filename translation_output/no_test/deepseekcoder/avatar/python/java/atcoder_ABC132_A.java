<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
s = sorted ( input ( ) )
if s [ 0 ] == s [ 1 ] and s [ 2 ] == s [ 3 ] and s [ 0 ] != s [ 2 ] : print ( ' Yes ' )
else : print ( ' No ' )


```

### Response:
Here is the Java version of your Python code:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] s = new int[4];
        for (int i = 0; i < 4; i++) {
            s[i] = scanner.nextInt();
        }
        Arrays.sort(s);
        if (s[0] == s[1] && s[2] == s[3] && s[0] != s[2]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

This Java code does the same thing as your Python code. It reads four integers from the user, sorts them, and then checks if the first two are equal and the last two are equal and the first two are not equal. If all these conditions are met, it prints "Yes", otherwise it prints "No".
<|EOT|>
