System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
432

Expected output:
401

```
n=int(input())

dic={}
for i in range(1,50001):
    p=int(i*1.08)
    dic[p]=i
if n in dic:
    print(dic[n])
else:
    print(":(")
```


Answer:
Here's the Java code equivalent to the given Python code:

```java
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= 50000; i++) {
            int p = (int) (i * 1.08);
            map.put(p, i);
        }
        if (map.containsKey(n)) {
            System.out.println(map.get(n));
        } else {
            System.out.println(":(");
        }
    }
}
```

You can test this code with the provided test case:

```java
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void testMain() {
        Main.main(new String[]{"432"});
        assertEquals("401", System.out.nextLine());
    }
}
```<|endoftext|>
