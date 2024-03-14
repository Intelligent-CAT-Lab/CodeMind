Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
a, b = input ( ). split ( ) ; b = int ( b [ : : - 1 ] ) ; print ( int ( a ) + b )


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int b = Integer.parseInt(new StringBuilder(input[1]).reverse().toString());
        System.out.println(Integer.parseInt(input[0]) + b);
    }
}
```<|endoftext|>
