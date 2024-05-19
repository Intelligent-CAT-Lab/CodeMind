System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 1 2

Expected output:
-60
72
31
-42
109
-30
184
336
492
1117

```
r, D, x = map ( int, input ( ). split ( ) )
for i in range ( 10 ) :
    x = r * x - D
    print ( x )


```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int r = Integer.parseInt(input[0]);
        int D = Integer.parseInt(input[1]);
        int x = Integer.parseInt(input[2]);

        for (int i = 0; i < 10; i++) {
            x = r * x - D;
            System.out.println(x);
        }
    }
}
```

Test input:
2 1 2

Expected output:
-60
72
31
-42
109
-30
184
336
492
1117<|endoftext|>
