Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
print ( chr ( ord ( input ( ) ) + 1 ) )


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c = (char) (scanner.next().charAt(0) + 1);
        System.out.println(c);
    }
}
```<|endoftext|>
