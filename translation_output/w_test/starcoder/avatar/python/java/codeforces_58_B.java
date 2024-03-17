<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
733035

Expected output:
733035 244345 48869 1


```
a = int ( input ( ) )
for i in range ( a, 0, - 1 ) :
    if a % i == 0 :
        print ( i, end ='â')
        a = i


```

java code:<fim_suffix><fim_middle>

```java
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = a; i > 0; i--) {
            if (a % i == 0) {
                System.out.print(i + " ");
                a = i;
            }
        }
    }
}
```
<|endoftext|>
