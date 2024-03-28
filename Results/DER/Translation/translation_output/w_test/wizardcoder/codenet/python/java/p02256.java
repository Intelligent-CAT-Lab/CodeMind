Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
54 20

Expected output:
2


```
x, y = map(int, input().split())
if x > y:
  x, y = y, x
while x % y!= 0:
  x, y = y, x % y
print(y)

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x > y) {
            int temp = x;
            x = y;
            y = temp;
        }
        while (x % y!= 0) {
            int temp = x % y;
            x = y;
            y = temp;
        }
        System.out.println(y);
    }
}
```<|endoftext|>
