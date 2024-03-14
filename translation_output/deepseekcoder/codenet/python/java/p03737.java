<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
s1,s2,s3=input().upper().split()
print(s1[0]+s2[0]+s3[0])
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toUpperCase();
        String[] words = input.split(" ");
        System.out.println(words[0].charAt(0) + "" + words[1].charAt(0) + "" + words[2].charAt(0));
    }
}
```

This Java code does the same thing as the Python code. It reads a line of input, converts it to uppercase, splits it into words, and then prints the first character of each word.
<|EOT|>
