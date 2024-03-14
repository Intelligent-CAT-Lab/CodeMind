Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
n=int(input())
print(1000-n%1000 if n%1000!=0 else 0)
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 1000 - n % 1000;
        if (n % 1000!= 0) {
            System.out.println(result);
        } else {
            System.out.println(0);
        }
    }
}
```<|endoftext|>
