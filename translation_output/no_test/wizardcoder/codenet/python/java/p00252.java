Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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

        for (String s : O) {
            if (B.equals(s)) {
                System.out.println("Open");
                break;
            }
        }

        if (B.equals("1 1 0") || B.equals("0 0 1")) {
            System.out.println("Close");
        }
    }
}
```<|endoftext|>
