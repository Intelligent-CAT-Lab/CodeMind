Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
+-++

Expected output:
2


```
a=input()
e=a.count("+")
f=a.count("-")
print(e-f)
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int e = 0, f = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '+') {
                e++;
            } else if (a.charAt(i) == '-') {
                f++;
            }
        }
        System.out.println(e - f);
    }
}
```<|endoftext|>
