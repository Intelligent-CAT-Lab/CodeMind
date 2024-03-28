<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
A , B = map ( int , input ( ) . split ( ) )
ans = A - 2 * B
if ans < 0 :
    ans = 0
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
        int A = Integer.parseInt(split[0]);
        int B = Integer.parseInt(split[1]);
        int ans = A - 2 * B;
        if (ans < 0) {
            ans = 0;
        }
        System.out.println(ans);
    }
}
```</s>
