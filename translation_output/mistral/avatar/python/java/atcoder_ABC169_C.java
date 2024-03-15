<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
a , b = input ( ) . split ( )
b = b [ 0 ] + b [ 2 : ]
a = int ( a )
b = int ( b )
print ( a * b // 100 )


```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] split = input.split(" ");
        String b = split[0] + split[2];
        int a = Integer.parseInt(split[0]);
        int b = Integer.parseInt(b);
        System.out.println(a * b / 100);
    }
}
```</s>
