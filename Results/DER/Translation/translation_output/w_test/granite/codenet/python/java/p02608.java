System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
20

Expected output:
0
0
0
0
0
1
0
0
0
0
3
0
0
0
0
0
3
3
0
0


```
import collections
n=int(input())
cnt=[]
for x in range(1,101):
  for y in range(1,101):
    for z in range(1,101):
      a=x**2+y**2+z**2+x*y+y*z+z*x
      if a<=n:
        cnt.append(a)
c=collections.Counter(cnt)
for i in range(1,n+1):
  print(c[i])
```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] cnt = new int[n+1];
        for (int x = 1; x <= 100; x++) {
            for (int y = 1; y <= 100; y++) {
                for (int z = 1; z <= 100; z++) {
                    int a = x*x + y*y + z*z + x*y + y*z + z*x;
                    if (a <= n) {
                        cnt[a]++;
                    }
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            System.out.println(cnt[i]);
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
        Main.main(new String[]{"20"});
        String expected = "0\n" +
                            "0\n" +
                            "0\n" +
                            "0\n" +
                            "0\n" +
                            "0\n" +
                            "1\n" +
                            "0\n" +
                            "0\n" +
                            "0\n" +
                            "3\n" +
                            "0\n" +
                            "0\n" +
                            "0\n" +
                            "0\n" +
                            "3\n" +
                            "3\n" +
                            "0\n" +
                            "0\n";
        assertEquals(expected, outContent.toString());
    }
}
```<|endoftext|>
