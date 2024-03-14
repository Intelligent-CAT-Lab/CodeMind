<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
a, b = map ( int, input ( ). split ( ) )
x = a
h = 0
s = 0
while x > 0 :
    x -= 1
    h += 1
    s += 1
while s // b!= 0 :
    h += 1
    s = s - b + 1
print ( h )


```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = a;
        int h = 0;
        int s = 0;
        while (x > 0) {
            x--;
            h++;
            s++;
        }
        while (s / b!= 0) {
            h++;
            s = s - b + 1;
        }
        System.out.println(h);
    }
}
```
<|endoftext|>
