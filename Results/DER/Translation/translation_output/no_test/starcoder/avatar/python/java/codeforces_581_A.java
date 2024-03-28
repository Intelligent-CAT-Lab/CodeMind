<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
x = list ( input ( ). split ( ) )
for i in range ( len ( x ) ) :
    x [ i ] = int ( x [ i ] )
a = x [ 0 ]
b = x [ 1 ]
print ( min ( x ), end = " â " )
if abs ( a - b ) >= 2 :
    print ( abs ( a - b ) // 2 )
else :
    print ( 0 )


```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[sc.nextInt()];
        for (int i = 0; i < x.length; i++) {
            x[i] = sc.nextInt();
        }
        int a = x[0];
        int b = x[1];
        System.out.print(Math.min(x) + " ");
        if (Math.abs(a - b) >= 2) {
            System.out.println(Math.abs(a - b) / 2);
        } else {
            System.out.println(0);
        }
    }
}
```
<|endoftext|>
