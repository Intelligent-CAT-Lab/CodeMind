<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 3 6 6

Expected output:
3 10 -1 7


```
x1 , y1 , x2 , y2 = map ( int , input ( ) . split ( ) )
a = x2 - x1
b = y2 - y1
print ( x2 - b , y2 + a , x1 - b , y1 + a )


```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1, y1, x2, y2;
        String input = scanner.nextLine();
        String[] split = input.split(" ");
        x1 = Integer.parseInt(split[0]);
        y1 = Integer.parseInt(split[1]);
        x2 = Integer.parseInt(split[2]);
        y2 = Integer.parseInt(split[3]);
        int a = x2 - x1;
        int b = y2 - y1;
        System.out.println(x2 - b + " " + y2 + a + " " + x1 - b + " " + y1 + a);
    }
}
```</s>
