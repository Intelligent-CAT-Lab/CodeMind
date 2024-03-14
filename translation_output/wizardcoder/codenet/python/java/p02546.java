Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
s = input()
if s[-1]=='s':
    print(s+'es')
else:
    print(s+'s')
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.endsWith("s")) {
            System.out.println(s + "es");
        } else {
            System.out.println(s + "s");
        }
    }
}
```<|endoftext|>
