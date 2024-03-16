<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
x1, y1, x2, y2 = map ( int, input ( ). split ( ) )
a = x2 - x1
b = y2 - y1
print ( x2 - b, y2 + a, x1 - b, y1 + a )


```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1, y1, x2, y2;
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        int a = x2 - x1;
        int b = y2 - y1;
        System.out.println(x2 - b + " " + (y2 + a) + " " + (x1 - b) + " " + (y1 + a));
    }
}
```
<|endoftext|>
