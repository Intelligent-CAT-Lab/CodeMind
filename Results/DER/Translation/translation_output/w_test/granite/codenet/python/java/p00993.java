System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2

Expected output:
8
2
3


```
print reduce( lambda x, y: x*y, [ x for x in range(1, 1501) ] )+2
for i in range(1, int(raw_input())+1): print i+1
```


Answer:
```java
import java.util.stream.IntStream;
import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {
        System.out.println(IntStream.range(1, 1501).reduce(1, (x, y) -> x * y) + 2);
        int n = Integer.parseInt(new java.util.Scanner(System.in).nextLine());
        IntStream.range(1, n + 1).forEach(i -> System.out.println(i + 1));
    }
}
```

Test input:
2

Expected output:
8
2
3
<|endoftext|>
