<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
999999999 1

Expected output:
1000000003

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
        int vamshi = scanner.nextInt();
        int z = scanner.nextInt();
        int result = (vamshi / z + 1) * z;
        System.out.println(result);
    }
}
```</s>
