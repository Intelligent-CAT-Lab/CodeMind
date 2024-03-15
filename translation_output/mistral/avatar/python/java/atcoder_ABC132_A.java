<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
s = sorted ( input ( ) )
if s [ 0 ] == s [ 1 ] and s [ 2 ] == s [ 3 ] and s [ 0 ] != s [ 2 ] : print ( ' Yes ' )
else : print ( ' No ' )


```
[/INST]
```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] s = new int[4];
        for (int i = 0; i < 4; i++) {
            s[i] = scanner.nextInt();
        }
        Arrays.sort(s);
        if (s[0] == s[1] && s[2] == s[3] && s[0] != s[2]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```</s>
