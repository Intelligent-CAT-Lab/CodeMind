System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3

Expected output:
-57

```
print[0,1,2,12,84,770,8340,106400,1546888,25343766,461133960,232367169,627905865,632459808,928262728,919805769,382796331,887217496,639768068,869694124,205875097,205589953,487772376,239955313,998339621,31622834,902930073,146839084,449786840,982224660,865803735,21834818,721531716,26008837,471774471,69010090,700009308,776938882,645550477,526939604,142728157,654489641,128201240,185493259,789721045,977049419,589149550,700648836,25087729,874433491,352791804][input()]
```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println(print[input]);
    }
}
```

You can write the following test case in a separate file named `MainTest.java`:

```java
import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testPrint() {
        assertEquals(-57, print[0]);
        assertEquals(12, print[1]);
        assertEquals(84, print[2]);
        assertEquals(770, print[3]);
        assertEquals(8340, print[4]);
        assertEquals(106400, print[5]);
        assertEquals(1546888, print[6]);
        assertEquals(25343766, print[7]);
        assertEquals(461133960, print[8]);
        assertEquals(232367169, print[9]);
    }
}
```<|endoftext|>
