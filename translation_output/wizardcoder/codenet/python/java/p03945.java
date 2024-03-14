Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
# coding: utf-8
print((lambda x:x.count('WB')+x.count('BW'))(input()))
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int count = (int) input.chars().filter(ch -> ch == 'W' || ch == 'B').count();
        System.out.println(count);
    }
}
```<|endoftext|>
