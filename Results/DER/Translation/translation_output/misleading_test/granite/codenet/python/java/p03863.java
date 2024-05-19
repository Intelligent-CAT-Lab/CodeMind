System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
aba

Expected output:
JeZnn"

```
s=input()
if (s[0]==s[-1] and len(s)%2==0) or (s[0]!=s[-1] and len(s)%2==1):
 print("First")
else:
 print("Second")
```


Answer:
Here's the Java code equivalent to the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if ((s.charAt(0) == s.charAt(s.length() - 1) && s.length() % 2 == 0) || (s.charAt(0)!= s.charAt(s.length() - 1) && s.length() % 2 == 1)) {
            System.out.println("First");
        } else {
            System.out.println("Second");
        }
    }
}
```

You can test this code with the following test case:

```java
import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void test() {
        Main main = new Main();
        String input = "aba";
        String expectedOutput = "First";
        String actualOutput = main.main(input);
        assertEquals(expectedOutput, actualOutput);
    }
}
```<|endoftext|>
