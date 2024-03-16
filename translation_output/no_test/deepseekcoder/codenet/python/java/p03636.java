<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
a,*b,c = input()
print(a+str(len(b))+c)

```

### Response:
Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] splitInput = input.split("\\*");
        String a = splitInput[0];
        String c = splitInput[2];
        String b = splitInput[1];
        System.out.println(a + b.length() + c);
    }
}
```

This Java code reads a line of input, splits it into three parts around the "*" character, and then prints the first part, the length of the second part, and the third part.
<|EOT|>
