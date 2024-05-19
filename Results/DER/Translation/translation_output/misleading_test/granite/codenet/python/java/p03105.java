System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 11 4

Expected output:
-79

```
a,b,c=map(int,input().split())
if a*c<b:
    print(c)
else:
    print(b//a)
```


Answer:
Here's the Java code equivalent to the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.close();

        if (a * c < b) {
            System.out.println(c);
        } else {
            System.out.println(b / a);
        }
    }
}
```

You can test the Java code with the following test case:

```java
import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testMain() {
        Main.main(new String[]{"2", "11", "4"});
        assertEquals(-79, System.out.nextInt());
    }
}
```<|endoftext|>
