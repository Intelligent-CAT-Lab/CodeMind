<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
vamshi , z = map ( int , input ( ) . split ( ) )
print ( ( vamshi // z + 1 ) * z )


```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] split = input.split(" ");
        int vamshi = Integer.parseInt(split[0]);
        int z = Integer.parseInt(split[1]);
        int result = (vamshi / z + 1) * z;
        System.out.println(result);
    }
}
```</s>
