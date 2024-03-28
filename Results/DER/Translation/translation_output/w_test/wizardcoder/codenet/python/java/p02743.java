Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 3 9

Expected output:
No


```
a,b,c = map(int,input().split())
if c-a-b < 0:
    print('No')
else:
    print('Yes' if 4*a*b < (c-a-b)**2 else 'No')
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (c-a-b < 0) {
            System.out.println("No");
        } else {
            if (4*a*b < (c-a-b)*(c-a-b)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
```<|endoftext|>
