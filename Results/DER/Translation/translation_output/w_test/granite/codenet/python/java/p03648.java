System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0

Expected output:
4
3 3 3 3


```
K=int(input())
print(50)
a,b=K//50,K%50
ans=[]
for i in range(50-b):
  ans.append(str(a+i))
  
for i in range(b):
  ans.append(str(a+50-b+i+1))
  
print(" ".join(ans))
```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        System.out.println(50);
        int a = K / 50;
        int b = K % 50;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 50 - b; i++) {
            sb.append(a + i).append(" ");
        }
        for (int i = 0; i < b; i++) {
            sb.append(a + 50 - b + i + 1).append(" ");
        }
        System.out.println(sb.toString().trim());
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
        Main.main(new String[]{"0"});
        assertEquals("4\n3 3 3 3", output());
    }

    @Test
    public void test2() {
        Main.main(new String[]{"1"});
        assertEquals("4\n3 3 3 4", output());
    }

    @Test
    public void test3() {
        Main.main(new String[]{"49"});
        assertEquals("4\n1 2 3 50", output());
    }

    @Test
    public void test4() {
        Main.main(new String[]{"50"});
        assertEquals("4\n1 2 3 4", output());
    }

    private String output() {
        return System.out.toString().trim();
    }
}
```<|endoftext|>
