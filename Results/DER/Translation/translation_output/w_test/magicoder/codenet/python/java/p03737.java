<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
atcoder beginner contest

Expected output:
ABC


```
s1,s2,s3=input().upper().split()
print(s1[0]+s2[0]+s3[0])
```

@@ Response
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toUpperCase();
        String[] words = input.split(" ");
        String result = words[0].substring(0, 1) + words[1].substring(0, 1) + words[2].substring(0, 1);
        System.out.println(result);
    }
}
```

This Java code does the same thing as the Python code. It reads a line of input from the user, converts it to uppercase, splits it into words, and then concatenates the first character of each word to form the output.<｜end▁of▁sentence｜>
