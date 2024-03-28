<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
BBA

Expected output:
o

```
stdin = input ( )
s = stdin
result = " Yes " if " A " in s and " B " in s else " No "
print ( result )


```

### Response:
Here is the Java equivalent of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String result = (s.contains("A") && s.contains("B")) ? "Yes" : "No";
        System.out.println(result);
    }
}
```

In this Java code, we use the `Scanner` class to read the input string. The `contains` method is used to check if the string contains "A" and "B". If both are present, the result is "Yes", otherwise it is "No".
<|EOT|>
