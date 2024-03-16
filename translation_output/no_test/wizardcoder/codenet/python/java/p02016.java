Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
print('square1001' if input()=='ani' else 'e869120')


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = "square1001";
        if (!input.equals("ani")) {
            output = "e869120";
        }
        System.out.println(output);
    }
}
```<|endoftext|>
