Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
print(int(input())*6.28)
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double angle = scanner.nextDouble();
        double radians = angle * 6.28;
        System.out.println(radians);
    }
}
```<|endoftext|>
