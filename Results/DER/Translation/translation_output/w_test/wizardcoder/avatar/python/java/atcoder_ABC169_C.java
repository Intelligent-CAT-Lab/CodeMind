Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
814793613347395 1.99

Expected output:
1621439290561316


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
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        String b = input[1].substring(0, 1) + input[1].substring(2);
        int a = Integer.parseInt(input[0]);
        int b1 = Integer.parseInt(b);
        System.out.println(a * b1 / 100);
    }
}
```<|endoftext|>
