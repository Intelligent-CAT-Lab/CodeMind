System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
AIZUNYANPEROPERO

Expected output:
UZ

```
s = input()
ans = ""
flag = False
for c in s:
  if c == "A" and not flag:flag = True
  if c == "Z" and flag:
    ans += "AZ"
    flag = False
if ans == "":
  print(-1)
else:
  print(ans)

```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = "";
        boolean flag = false;
        for (char c : s.toCharArray()) {
            if (c == 'A' &&!flag) {
                flag = true;
            }
            if (c == 'Z' && flag) {
                ans += "AZ";
                flag = false;
            }
        }
        if (ans.equals("")) {
            System.out.println(-1);
        } else {
            System.out.println(ans);
        }
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
        Main.main(new String[]{"AIZUNYANPEROPERO"});
        assertEquals("UZ", System.out.nextLine());
    }

    @Test
    public void test2() {
        Main.main(new String[]{"ABC"});
        assertEquals(-1, System.out.nextInt());
    }

    @Test
    public void test3() {
        Main.main(new String[]{"ABAZ"});
        assertEquals("AZ", System.out.nextLine());
    }
}
```<|endoftext|>
