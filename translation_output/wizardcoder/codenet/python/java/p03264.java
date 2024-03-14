Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
import math
k=int(input())
print(math.ceil(k/2)*(k//2))
```

### Response:
```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println(Math.ceil(k/2)*(k/2));
    }
}
```<|endoftext|>
