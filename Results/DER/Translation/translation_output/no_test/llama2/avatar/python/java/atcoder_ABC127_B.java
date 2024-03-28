<s> Translate the following python code to java and enclose your solution inside ```java```:
```
r , D , x = map ( int , input ( ) . split ( ) )
for i in range ( 10 ) :
    x = r * x - D
    print ( x )


```

### Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r, D, x;
        r = Integer.parseInt(sc.nextLine());
        D = Integer.parseInt(sc.nextLine());
        x = r * x - D;
        for (int i = 1; i <= 10; i++) {
            System.out.println(x);
        }
    }
}
```
</s>
