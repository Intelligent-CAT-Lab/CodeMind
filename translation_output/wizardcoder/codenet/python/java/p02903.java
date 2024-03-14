Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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
        sc.close();

        for (int i = 0; i < h; i++) {
            if (i < b) {
                System.out.println(String.join("", "0".repeat(a) + "1".repeat(w - a)));
            } else {
                System.out.println(String.join("", "1".repeat(a) + "0".repeat(w - a)));
            }
        }
    }
}
```<|endoftext|>
