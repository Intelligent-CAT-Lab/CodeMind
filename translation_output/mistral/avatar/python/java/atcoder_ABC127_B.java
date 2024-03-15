<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
r , D , x = map ( int , input ( ) . split ( ) )
for i in range ( 10 ) :
    x = r * x - D
    print ( x )


```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r, D, x;
        String input = scanner.nextLine();
        String[] split = input.split(" ");
        r = Integer.parseInt(split[0]);
        D = Integer.parseInt(split[1]);
        x = Integer.parseInt(split[2]);

        for (int i = 0; i < 10; i++) {
            x = r * x - D;
            System.out.println(x);
        }
    }
}
```</s>
