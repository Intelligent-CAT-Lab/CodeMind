<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
S = input()
if S.count("AC") >= 1:
  print("Yes")
else:
  print("No")

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        if (S.contains("AC")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```
<|EOT|>
