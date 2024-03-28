Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
-3 3

Expected output:
0


```
H,R = map(int,input().split())

if H>=0:
    print(1)
elif  H<0:
    if H+R>0:
        print(1)
    elif H+R==0:
        print(0)
    else:
        print(-1)
        


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int R = sc.nextInt();
        if (H >= 0) {
            System.out.println(1);
        } else if (H < 0) {
            if (H + R > 0) {
                System.out.println(1);
            } else if (H + R == 0) {
                System.out.println(0);
            } else {
                System.out.println(-1);
            }
        }
    }
}
```<|endoftext|>
