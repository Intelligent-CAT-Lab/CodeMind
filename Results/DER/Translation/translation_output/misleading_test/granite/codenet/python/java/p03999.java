System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
125

Expected output:
234

```

s = input()

ans = 0
for i in range(2 ** (len(s) - 1)):
    pat = s[0]
    index = 1
    for j in range(len(s) - 1):
        if i >> j & 1:
            pat += "+"
        pat += s[index]
        index += 1
    #print(pat)
    ans += eval(pat)

print(ans)
```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = 0;
        for (int i = 0; i < Math.pow(2, s.length() - 1); i++) {
            String pat = s.substring(0, 1);
            int index = 1;
            for (int j = 0; j < s.length() - 1; j++) {
                if ((i >> j) % 2 == 1) {
                    pat += "+";
                }
                pat += s.substring(index, index + 1);
                index++;
            }
            //System.out.println(pat);
            ans += eval(pat);
        }
        System.out.println(ans);
    }

    public static int eval(String s) {
        Deque<Integer> stack = new LinkedList<>();
        Deque<Character> op = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                stack.push(c - '0');
            } else {
                int b = stack.pop();
                int a = stack.pop();
                if (op.isEmpty() || op.peek() == '+') {
                    stack.push(a + b);
                } else {
                    stack.push(a - b);
                }
                op.pop();
            }
        }
        return stack.pop();
    }
}
```

You can write the following test cases to ensure it works correctly:

```java
import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void test1() {
        assertEquals(234, Main.eval("125"));
    }

    @Test
    public void test2() {
        assertEquals(10, Main.eval("10"));
    }

    @Test
    public void test3() {
        assertEquals(15, Main.eval("1+2+3"));
    }

    @Test
    public void test4() {
        assertEquals(21, Main.eval("1+2+3+4"));
    }
}
```<|endoftext|>
