<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
A , B , T = map ( int , input ( ) . split ( ) )
ans = ( T // A ) * B
print ( ans )


```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A, B, T;
        String input = scanner.nextLine();
        String[] split = input.split(" ");
        A = Integer.parseInt(split[0]);
        B = Integer.parseInt(split[1]);
        T = Integer.parseInt(split[2]);
        int ans = (T / A) * B;
        System.out.println(ans);
    }
}
```</s>
