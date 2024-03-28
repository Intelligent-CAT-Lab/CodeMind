Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
35005211 521595368

Expected output:
898600336


```
a, b = input ( ). split ( ) ; b = int ( b [ : : - 1 ] ) ; print ( int ( a ) + b )


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(new StringBuilder(input[1]).reverse().toString());
        System.out.println(a + b);
    }
}
```<|endoftext|>
