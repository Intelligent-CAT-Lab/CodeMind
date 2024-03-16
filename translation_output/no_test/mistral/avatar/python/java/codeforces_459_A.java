<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
anti , b , c , d = map ( int , input ( ) . split ( ) )
l = abs ( anti - c ) ; m = abs ( b - d )
if anti == c : print ( anti + m , b , c + m , d )
elif b == d : print ( anti , b + l , c , d + l )
elif l != m : print ( - 1 )
else : print ( anti , d , c , b )


```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int anti, b, c, d;
        String input = scanner.nextLine();
        String[] split = input.split(" ");
        anti = Integer.parseInt(split[0]);
        b = Integer.parseInt(split[1]);
        c = Integer.parseInt(split[2]);
        d = Integer.parseInt(split[3]);
        int l = Math.abs(anti - c);
        int m = Math.abs(b - d);
        if (anti == c) {
            System.out.println(anti + m, b, c + m, d);
        } else if (b == d) {
            System.out.println(anti, b + l, c, d + l);
        } else if (l != m) {
            System.out.println(-1);
        } else {
            System.out.println(anti, d, c, b);
        }
    }
}
```</s>
