Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```

h1, m1, h2, m2, k = map(int, input().split())
#ä¸è¡ã§å¥åãããæ°å¤ãããããã®å¤æ°ã«
#3ã¤ä»¥ä¸ãå¯

t1 = 60*h1 + m1
t2 = 60*h2 + m2

print(t2-t1-k)

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h1 = sc.nextInt();
        int m1 = sc.nextInt();
        int h2 = sc.nextInt();
        int m2 = sc.nextInt();
        int k = sc.nextInt();
        int t1 = 60*h1 + m1;
        int t2 = 60*h2 + m2;
        System.out.println(t2-t1-k);
    }
}
```<|endoftext|>
