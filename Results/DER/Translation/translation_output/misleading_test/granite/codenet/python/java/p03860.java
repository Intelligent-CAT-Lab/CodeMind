System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
AtCoder Beginner Contest

Expected output:
AC

```
A,x,C=input().split()
print("A"+x[0]+"C")

```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] split = input.split(" ");
        String A = split[0];
        String x = split[1];
        String C = split[2];
        String result = "A" + x.charAt(0) + "C";
        System.out.println(result);
    }
}
```

You can write the following test case in a separate class to test the functionality of the code:

```java
import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testTranslation() {
        String input = "AtCoder Beginner Contest";
        String expectedOutput = "AC";
        Main main = new Main();
        main.main(new String[]{input});
        assertEquals(expectedOutput, main.result);
    }
}
```<|endoftext|>
