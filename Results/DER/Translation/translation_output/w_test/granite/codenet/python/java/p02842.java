System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
432

Expected output:
400


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
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] prices = new int[50000];
        for (int i = 0; i < 50000; i++) {
            prices[i] = (int) (1.08 * i);
        }
        for (int i = 0; i < 50000; i++) {
            if (prices[i] == n) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(":(");
    }
}
```

You can write the following test case to test the above code:

```java
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void test1() {
        Main.main(new String[]{"432"});
        assertEquals("400", System.out.nextLine());
    }
}
```<|endoftext|>
