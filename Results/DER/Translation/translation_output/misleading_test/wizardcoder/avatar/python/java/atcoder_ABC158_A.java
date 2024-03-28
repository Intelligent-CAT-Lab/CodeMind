Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
BBA

Expected output:
o

```
stdin = input ( )
s = stdin
result = " Yes " if " A " in s and " B " in s else " No "
print ( result )


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String result = " Yes " + (s.contains(" A ") && s.contains(" B "))? " Yes " : " No ";
        System.out.println(result);
    }
}
```<|endoftext|>
