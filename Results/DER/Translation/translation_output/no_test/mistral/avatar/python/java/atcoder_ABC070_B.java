<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
a , b , c , d = map ( int , input ( ) . split ( ) )
print ( max ( 0 , min ( b , d ) - max ( a , c ) ) )


```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c, d;
        String input = scanner.nextLine();
        String[] split = input.split(" ");
        a = Integer.parseInt(split[0]);
        b = Integer.parseInt(split[1]);
        c = Integer.parseInt(split[2]);
        d = Integer.parseInt(split[3]);
        int result = Math.max(0, Math.min(b, d) - Math.max(a, c));
        System.out.println(result);
    }
}
```</s>
