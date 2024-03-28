<s> Translate the following python code to java and enclose your solution inside ```java```:
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

### Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = Integer.parseInt(sc.nextLine());
        b = Integer.parseInt(sc.nextLine());
        int x = a;
        int h = 0;
        int s = 0;
        while (x > 0) {
            x -= 1;
            h += 1;
            s += 1;
        }
        while (s / b != 0) {
            h += 1;
            s = s - b + 1;
        }
        System.out.println(h);
    }
}
```
</s>
