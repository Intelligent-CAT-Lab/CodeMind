Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
print reduce( lambda x, y: x*y, [ x for x in range(1, 1501) ] )+2
for i in range(1, int(raw_input())+1): print i+1
```

### Response:
```java
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int result = IntStream.rangeClosed(1, 1500)
               .reduce(1, (x, y) -> x * y);
        System.out.println(result + 2);

        int n = Integer.parseInt(args[0]);
        for (int i = 1; i <= n; i++) {
            System.out.println(i + 1);
        }
    }
}
```<|endoftext|>
