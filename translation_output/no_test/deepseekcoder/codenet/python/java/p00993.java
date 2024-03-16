<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
print reduce( lambda x, y: x*y, [ x for x in range(1, 1501) ] )+2
for i in range(1, int(raw_input())+1): print i+1
```

### Response:
Here is the Java equivalent of the Python code you provided:

```java
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        long product = IntStream.rangeClosed(1, 1500)
                               .reduce(1, (x, y) -> x * y);
        System.out.println(product + 2);

        int n = Integer.parseInt(System.console().readLine());
        IntStream.rangeClosed(1, n)
                 .forEach(i -> System.out.println(i + 1));
    }
}
```

This Java code does the same thing as your Python code. It calculates the product of all integers from 1 to 1500 and adds 2 to the result. Then it reads an integer from the standard input, and prints all integers from 1 to that number plus 1.

Please note that `System.console().readLine()` is used to read from the standard input in Java. It is equivalent to `raw_input()` in Python. Also, `IntStream.rangeClosed(1, 1500).reduce(1, (x, y) -> x * y)` is used to calculate the product of all integers from 1 to 1500. It is equivalent to `reduce(lambda x, y: x*y, [ x for x in range(1, 1501) ])` in Python.
<|EOT|>
