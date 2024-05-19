System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 3 6 6

Expected output:
3 10 -1 7 69

```
x1, y1, x2, y2 = map ( int, input ( ). split ( ) )
a = x2 - x1
b = y2 - y1
print ( x2 - b, y2 + a, x1 - b, y1 + a )


```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int x1 = Integer.parseInt(input[0]);
        int y1 = Integer.parseInt(input[1]);
        int x2 = Integer.parseInt(input[2]);
        int y2 = Integer.parseInt(input[3]);
        int a = x2 - x1;
        int b = y2 - y1;
        System.out.println((x2 - b) + " " + (y2 + a) + " " + (x1 - b) + " " + (y1 + a));
    }
}
```

Test input:
2 3 6 6

Expected output:
3 10 -1 7 69<|endoftext|>
