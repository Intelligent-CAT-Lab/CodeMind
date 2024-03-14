<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
s = input().split()
print(int(s[0]) - int(s[1]))

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");
        int result = Integer.parseInt(s[0]) - Integer.parseInt(s[1]);
        System.out.println(result);
    }
}
```
<|EOT|>
