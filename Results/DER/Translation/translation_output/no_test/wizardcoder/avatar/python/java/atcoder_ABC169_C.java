Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
a, b = input ( ). split ( )
b = b [ 0 ] + b [ 2 : ]
a = int ( a )
b = int ( b )
print ( a * b // 100 )


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] arr = input.split(" ");
        String b = arr[1];
        b = b.substring(0, 1) + b.substring(2);
        int a = Integer.parseInt(arr[0]);
        int b1 = Integer.parseInt(b);
        int result = a * b1 / 100;
        System.out.println(result);
    }
}
```<|endoftext|>
