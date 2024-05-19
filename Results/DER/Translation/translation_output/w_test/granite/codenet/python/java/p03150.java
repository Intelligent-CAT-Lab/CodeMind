System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
keyofscience

Expected output:
YES


```
S = input()
for i in range(len(S)):
    for j in range(i,len(S)+1):
        if S[:i]+S[j:] == "keyence":
            print("YES")
            exit()
for k in range(len(S)):
    if S[i::i+8] == "keyence":
        print("YES")
        exit()
print("NO")
```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String keyence = "keyence";
        int len = S.length();
        int keyenceLen = keyence.length();

        if (len < keyenceLen) {
            System.out.println("NO");
            return;
        }

        for (int i = 0; i < keyenceLen; i++) {
            if (S.charAt(i)!= keyence.charAt(i)) {
                break;
            }
            if (i == keyenceLen - 1) {
                System.out.println("YES");
                return;
            }
        }

        for (int i = 1; i <= keyenceLen; i++) {
            if (S.charAt(len - i)!= keyence.charAt(keyenceLen - i)) {
                break;
            }
            if (i == keyenceLen) {
                System.out.println("YES");
                return;
            }
        }

        System.out.println("NO");
    }
}
```

You can write the following test cases to ensure it works correctly:

```java
class TestMain {
    public static void main(String[] args) {
        assertMain("keyence", "YES");
        assertMain("keyofscience", "YES");
        assertMain("xyzkeyence", "NO");
        assertMain("keyenceof", "NO");
    }

    public static void assertMain(String input, String expectedOutput) {
        System.setOut(new PrintStream(output));
        Main.main(new String[]{input});
        System.setOut(originalOut);
        assertEquals(expectedOutput, output.getBuffer().toString().trim());
    }

    private static final PrintStream originalOut = System.out;
    private static final ByteArrayOutputStream output = new ByteArrayOutputStream();

    public static void assertEquals(String expected, String actual) {
        if (expected.equals(actual)) {
            return;
        }
        throw new RuntimeException("Assertion failed: " +
            "expected:<" + expected + ">, but was:<" + actual + ">");
    }
}
```<|endoftext|>
