Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
# -*- coding: utf-8 -*-

L = int(input())
hen = L/3
print(hen**3)

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int hen = L/3;
        int volume = hen*hen*hen;
        System.out.println(volume);
    }
}
```<|endoftext|>
