Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
if '9' in input():
    print('Yes')
else:
    print('No')
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.contains("9")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```<|endoftext|>
