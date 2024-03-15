<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
a , b , c , d = map ( int , input ( ) . split ( ) )
ans = max ( a * c , a * d , b * c , b * d )
print ( ans )


```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] split = input.split(" ");
        int a = Integer.parseInt(split[0]);
        int b = Integer.parseInt(split[1]);
        int c = Integer.parseInt(split[2]);
        int d = Integer.parseInt(split[3]);
        int ans = Math.max(a * c, a * d, b * c, b * d);
        System.out.println(ans);
    }
}
```</s>
