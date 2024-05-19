System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000000000 1000000000000 1000000000000

Expected output:
-28 999999999909

```
number = input ( )
a, b, k = [ int ( ele ) for ele in number. split ('â') ]
res = a - k
if res < 0 :
    a = 0
    b = b + res
    b = 0 if b < 0 else b
else :
    a = res
print ( a, b )


```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" â ");
        long a = Long.parseLong(input[0]);
        long b = Long.parseLong(input[1]);
        long k = Long.parseLong(input[2]);
        long res = a - k;
        if (res < 0) {
            a = 0;
            b = b + res;
            b = b < 0? 0 : b;
        } else {
            a = res;
        }
        System.out.println(a + " " + b);
    }
}
```

You can write the following test cases to ensure it works correctly:

```java
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void test1() {
        Main.main("10000000000000 10000000000000 10000000000000".split(" "));
        assertEquals("0 9999999999909", Main.output.trim());
    }

    @Test
    public void test2() {
        Main.main("10000000000000 10000000000000 10000000000001".split(" "));
        assertEquals("9999999999999 0", Main.output.trim());
    }

    @Test
    public void test3() {
        Main.main("10000000000000 10000000000000 99999999999999".split(" "));
        assertEquals("1 0", Main.output.trim());
    }
}
```<|endoftext|>
