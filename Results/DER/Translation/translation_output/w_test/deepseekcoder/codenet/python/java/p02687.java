<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
ABC

Expected output:
ARC


```
string = input()
if string == "ARC":
  print("ABC")
else:
  print("ARC")
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        if (string.equals("ARC")) {
            System.out.println("ABC");
        } else {
            System.out.println("ARC");
        }
    }
}
```
<|EOT|>
