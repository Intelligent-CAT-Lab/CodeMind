Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
    String string = scanner.nextLine();
    if (string.equals("ARC")) {
      System.out.println("ABC");
    } else {
      System.out.println("ARC");
    }
  }
}
```<|endoftext|>
