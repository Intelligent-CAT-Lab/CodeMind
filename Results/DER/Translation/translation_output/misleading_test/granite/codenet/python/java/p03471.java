System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
9 45000

Expected output:
4 0 5 -6

```
n,y=map(int,input().split())
for i in range(n+1):
    for j in range(n-i+1):
        if (y-(i*10000+j*5000))/1000==(n-i-j):
            print(str(i)+' '+str(j)+' '+str(n-i-j))
            exit()
print('-1 -1 -1')
```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                if ((y - (i * 10000 + j * 5000)) / 10000 == (n - i - j)) {
                    System.out.println(i + " " + j + " " + (n - i - j));
                    return;
                }
            }
        }
        System.out.println("-1 -1 -1");
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
        Main.main(new String[]{"9", "45000"});
        assertEquals("4 0 5", System.out.nextLine());
    }

    @Test
    public void test2() {
        Main.main(new String[]{"10", "50000"});
        assertEquals("0 0 10", System.out.nextLine());
    }

    @Test
    public void test3() {
        Main.main(new String[]{"15", "75000"});
        assertEquals("3 0 12", System.out.nextLine());
    }

    @Test
    public void test4() {
        Main.main(new String[]{"20", "100000"});
        assertEquals("5 0 15", System.out.nextLine());
    }

    @Test
    public void test5() {
        Main.main(new String[]{"25", "125000"});
        assertEquals("7 0 18", System.out.nextLine());
    }
}
```<|endoftext|>
