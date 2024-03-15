<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
a , b = map ( int , input ( ) . split ( ) )
x = a
h = 0
s = 0
while x > 0 :
    x -= 1
    h += 1
    s += 1
while s // b != 0 :
    h += 1
    s = s - b + 1
print ( h )


```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        a = Integer.parseInt(scanner.nextLine().split(" ")[0]);
        b = Integer.parseInt(scanner.nextLine().split(" ")[1]);
        int x = a;
        int h = 0;
        int s = 0;
        while (x > 0) {
            x--;
            h++;
            s++;
        }
        while (s % b != 0) {
            h++;
            s = s - b + 1;
        }
        System.out.println(h);
    }
}
```</s>
