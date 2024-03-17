Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
abc

Expected output:
cba


```
l=input()
if len(l)==2:
    print(l)
else:
    print(l[::-1])
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (str.length() == 2) {
            System.out.println(str);
        } else {
            System.out.println(new StringBuilder(str).reverse().toString());
        }
    }
}
```<|endoftext|>
