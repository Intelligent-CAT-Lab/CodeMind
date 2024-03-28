Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1

Expected output:
360


```
X = int ( input ( ) )
i = 1
a = 0
while True :
    a = a + X
    if a % 360 == 0 :
        print ( i )
        break
    i += 1


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int i = 1;
        int a = 0;
        while (true) {
            a = a + X;
            if (a % 360 == 0) {
                System.out.println(i);
                break;
            }
            i++;
        }
    }
}
```<|endoftext|>
