Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 3 6 6

Expected output:
3 10 -1 7 69

```
x1, y1, x2, y2 = map ( int, input ( ). split ( ) )
a = x2 - x1
b = y2 - y1
print ( x2 - b, y2 + a, x1 - b, y1 + a )


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int a = x2 - x1;
        int b = y2 - y1;
        System.out.println(x2 - b + " " + y2 + a + " " + x1 - b + " " + y1 + a);
    }
}
```<|endoftext|>
