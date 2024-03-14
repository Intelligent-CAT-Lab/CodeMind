Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
a,*b,c = input()
print(a+str(len(b))+c)

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] arr = input.split(",");
        String a = arr[0];
        String b = arr[1];
        String c = arr[2];
        System.out.println(a + b.length() + c);
    }
}
```<|endoftext|>
