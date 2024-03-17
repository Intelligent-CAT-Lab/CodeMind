Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
aba

Expected output:
Second


```
s = input()
if s[0] == s[-1]:
    if len(s) % 2:
        ans = 'Second'
    else:
        ans = 'First'
else:
    if len(s) % 2:
        ans = 'First'
    else:
        ans = 'Second'
print(ans)
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            if (s.length() % 2!= 0) {
                System.out.println("Second");
            } else {
                System.out.println("First");
            }
        } else {
            if (s.length() % 2!= 0) {
                System.out.println("First");
            } else {
                System.out.println("Second");
            }
        }
    }
}
```<|endoftext|>
