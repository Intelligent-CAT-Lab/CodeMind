<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0

Expected output:
-95

```
x = int ( input ( ) )
if x == 1 :
    print ( 0 )
else :
    print ( 1 )


```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x==1)
            System.out.println(0);
        else
            System.out.println(1);
    }
}
```

'''
<|endoftext|>
