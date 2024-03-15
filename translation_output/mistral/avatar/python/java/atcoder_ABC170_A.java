<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
a = list ( map ( int , input ( ) . split ( ) ) )
for e , i in enumerate ( a ) :
    if i == 0 :
        print ( e + 1 )
        break


```
[/INST]
```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] split = input.split(" ");
        int[] a = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            a[i] = Integer.parseInt(split[i]);
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}
```</s>
