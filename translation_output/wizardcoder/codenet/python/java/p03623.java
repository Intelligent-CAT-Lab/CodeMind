Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
x,a,b=map(int,input().split())
print('A' if abs(x-a)<abs(x-b) else 'B')
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (Math.abs(x - a) < Math.abs(x - b)) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }
    }
}
```<|endoftext|>
