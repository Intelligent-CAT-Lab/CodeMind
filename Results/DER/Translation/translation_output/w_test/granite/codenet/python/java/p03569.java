System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
xabxa

Expected output:
2


```
import sys
S = str(input())
i = 0
j = len(S) - 1
c = 0
while(True):
    if i >= j:
        break
    if (S[i] == S[j]):
        i += 1
        j -= 1
    else:
        if (S[i] == 'x'):
            i += 1
            c += 1
        elif (S[j] == 'x'):
            j -= 1
            c += 1
        else:
            print('-1')
            sys.exit()
print(c)
```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int i = 0;
        int j = S.length() - 1;
        int c = 0;
        while (true) {
            if (i >= j) {
                break;
            }
            if (S.charAt(i) == S.charAt(j)) {
                i++;
                j--;
            } else {
                if (S.charAt(i) == 'x') {
                    i++;
                    c++;
                } else if (S.charAt(j) == 'x') {
                    j--;
                    c++;
                } else {
                    System.out.println(-1);
                    return;
                }
            }
        }
        System.out.println(c);
    }
}
```

You can write the following test cases to ensure it works correctly:

```java
class TestMain {
    public static void main(String[] args) {
        assertMain("aabaa", 1);
        assertMain("aabaxb", 1);
        assertMain("xabab", 2);
        assertMain("xababx", 3);
        assertMain("xababab", -1);
    }

    public static void assertMain(String input, int expectedOutput) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        PrintStream originalOut = System.out;
        ByteArrayOutputStream interceptedOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(interceptedOut));

        Main.main(new String[]{});

        System.setOut(originalOut);

        String interceptedOutput = interceptedOut.toString().trim();
        assert interceptedOutput.equals(String.valueOf(expectedOutput));
    }
}
```<|endoftext|>
