System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
KIHBR

Expected output:
spC

```
S=input()
b=S.replace("A","")=="KIHBR"
if b:
    L=list(map(len, "".join("*" if s!="A" else s for s in S).split("*")))
    X=[1,0,0,1,1,1,1]
    b&=all(L[i]<=X[i] for i in range(len(L)))
print("YNEOS"[not b::2])
```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        boolean b = S.replace("A", "").equals("KIHBR");
        if (b) {
            String[] split = "".join("*" + (s.equals("A")? s : "") for s : S.split("")).split("\\*", -1);
            int[] L = Arrays.stream(split).mapToInt(String::length).toArray();
            int[] X = {1, 0, 0, 0, 1, 1, 1, 1};
            b &= Arrays.stream(L).allMatch(value -> value <= X[Arrays.asList(L).indexOf(value)]);
        }
        System.out.println(b? "Y" : "N");
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
        Main main = new Main();
        String input = "KIHBR";
        String expectedOutput = "Y";
        assertEquals(expectedOutput, main.main(input));
    }

    @Test
    public void test2() {
        Main main = new Main();
        String input = "KIHBRA";
        String expectedOutput = "N";
        assertEquals(expectedOutput, main.main(input));
    }

    @Test
    public void test3() {
        Main main = new Main();
        String input = "KIHBRA";
        String expectedOutput = "N";
        assertEquals(expectedOutput, main.main(input));
    }
}
```<|endoftext|>
