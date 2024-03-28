Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
x = int ( input ( ) )
if x == 1 :
    print ( 0 )
else :
    print ( 1 )


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        if (x == 1) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }
}
```<|endoftext|>
