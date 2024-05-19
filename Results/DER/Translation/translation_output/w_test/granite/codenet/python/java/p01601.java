System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
13

Expected output:
11


```
def palind(n):
  return str(n) == str(n)[::-1]

n = input()
for i in range(100000):
  if n >= i and palind(n - i):
    print n - i
    break
  if palind(n + i):
    print n + i
    break
```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < 100000; i++) {
            if (isPalindrome(n - i)) {
                System.out.println(n - i);
                break;
            }
            if (isPalindrome(n + i)) {
                System.out.println(n + i);
                break;
            }
        }
    }

    public static boolean isPalindrome(int n) {
        String str = Integer.toString(n);
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i)!= str.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
```

You can write the following test cases to ensure it works correctly:

```java
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void testIsPalindrome() {
        assertEquals(true, isPalindrome(121));
        assertEquals(true, isPalindrome(131));
        assertEquals(false, isPalindrome(123));
    }

    @Test
    public void testMain() {
        assertEquals("11", runMain(13));
        assertEquals("11", runMain(121));
        assertEquals("131", runMain(1313));
    }

    private static String runMain(int n) {
        StringBuilder outContent = new StringBuilder();
        System.setOut(new PrintStream(outContent));
        Main.main(new String[]{Integer.toString(n)});
        return outContent.toString().trim();
    }
}
```<|endoftext|>
