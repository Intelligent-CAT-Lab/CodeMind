<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
l=input()
if len(l)==2:
    print(l)
else:
    print(l[::-1])
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String l = scanner.nextLine();
        if (l.length() == 2) {
            System.out.println(l);
        } else {
            StringBuilder sb = new StringBuilder(l);
            System.out.println(sb.reverse().toString());
        }
    }
}
```
<|EOT|>
