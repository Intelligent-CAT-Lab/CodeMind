Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 3 1 1

Expected output:
100
010
001


```
h,w,a,b = map(int,input().split())
for i in range(h):
    if i < b:
        print("".join(["0"]*a+["1"]*(w-a)))
    else:
        print("".join(["1"]*a+["0"]*(w-a)))

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = 0; i < h; i++) {
            if (i < b) {
                System.out.println(new StringBuilder().append("0" * a).append("1" * (w - a)).toString());
            } else {
                System.out.println(new StringBuilder().append("1" * a).append("0" * (w - a)).toString());
            }
        }
    }
}
```<|endoftext|>
