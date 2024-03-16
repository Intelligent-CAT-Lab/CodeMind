<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
print reduce( lambda x, y: x*y, [ x for x in range(1, 1501) ] )+2
for i in range(1, int(raw_input())+1): print i+1
```

@@ Response
Here is the Java equivalent of the given Python code:

```java
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        long product = IntStream.range(1, 1501)
                .reduce(1, (a, b) -> a * b);
        System.out.println(product + 2);

        int n = Integer.parseInt(System.console().readLine());
        for (int i = 1; i <= n; i++) {
            System.out.println(i + 1);
        }
    }
}
```

This Java code does the same thing as the Python code. It calculates the product of all numbers from 1 to 1500 and adds 2 to the result. Then it reads an integer from the console, and prints all numbers from 1 to that integer, each incremented by 1.<｜end▁of▁sentence｜>
