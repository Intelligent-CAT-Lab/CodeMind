<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
-1000000000 -1

Expected output:
Positie

```
a, b = map ( int, input ( ). split ( ) )
if a <= 0 and 0 <= b :
    print ( " Zero " )
elif a < 0 and min ( b - a, - a ) % 2 == 0 :
    print ( " Negative " )
else :
    print ( " Positive " )


```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a <= 0 && 0 <= b) {
            System.out.println("Zero");
        } else if (a < 0 && Math.min(b - a, -a) % 2 == 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Positive");
        }
    }
}
```

'''
<|endoftext|>
