Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0 0 1

Expected output:
Op]n

```
B = input()

O = ["1 1 0", "0 0 1"]

if B in O :
    print("Open")
else :
    print("Close")


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String B = sc.nextLine();
        String[] O = {"1 1 0", "0 0 1"};
        boolean flag = false;
        for (String s : O) {
            if (B.equals(s)) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("Open");
        } else {
            System.out.println("Close");
        }
    }
}
```<|endoftext|>
