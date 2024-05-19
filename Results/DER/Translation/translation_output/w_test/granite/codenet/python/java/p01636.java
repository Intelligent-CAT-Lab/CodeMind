System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
19

Expected output:
1


```
a = input()
ans = 0
for i in range(1, len(a)):
  df = a[:i]
  sm = a[i:]
  if sm[0] == "0":continue
  df = int(df)
  sm = int(sm)
  if (df + sm) % 2 == 0 and sm >= df and (sm - df) % 2 == 0:
    ans += 1
if int(a) % 2 == 0:ans += 1
print(ans)

```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int ans = 0;
        for (int i = 1; i < a.length(); i++) {
            String df = a.substring(0, i);
            String sm = a.substring(i);
            if (sm.charAt(0) == '0') continue;
            int dfInt = Integer.parseInt(df);
            int smInt = Integer.parseInt(sm);
            if ((dfInt + smInt) % 2 == 0 && smInt >= dfInt && (smInt - dfInt) % 2 == 0) {
                ans += 1;
            }
        }
        if (Integer.parseInt(a) % 2 == 0) ans += 1;
        System.out.println(ans);
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
        Main.main(new String[]{"19"});
        assertEquals(1, System.out.nextInt());
    }

    @Test
    public void test2() {
        Main.main(new String[]{"100"});
        assertEquals(2, System.out.nextInt());
    }

    @Test
    public void test3() {
        Main.main(new String[]{"101"});
        assertEquals(3, System.out.nextInt());
    }

    @Test
    public void test4() {
        Main.main(new String[]{"1010"});
        assertEquals(5, System.out.nextInt());
    }
}
```<|endoftext|>
