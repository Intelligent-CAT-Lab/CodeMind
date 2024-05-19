System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1.000

Expected output:
33.29131990083172

```
n=float(input())
print(n//1+1 if n*2**0.5<n//1+1 else n*2**0.5)
```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        double result = n % 1 == 0? n : n * Math.pow(2, 0.5);
        System.out.println(result);
    }
}
```

You can run this code with the following test case:

```java
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void test1() {
        Main.main(new String[]{"1.000"});
    }

    @Test
    public void test2() {
        Main.main(new String[]{"2.000"});
    }

    @Test
    public void test3() {
        Main.main(new String[]{"3.000"});
    }
}
```<|endoftext|>
