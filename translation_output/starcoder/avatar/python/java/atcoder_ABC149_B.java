<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
number = input ( )
a, b, k = [ int ( ele ) for ele in number. split ('â') ]
res = a - k
if res < 0 :
    a = 0
    b = b + res
    b = 0 if b < 0 else b
else :
    a = res
print ( a, b )


```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        String[] arr = number.split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int k = Integer.parseInt(arr[2]);
        int res = a - k;
        if (res < 0) {
            a = 0;
            b = b + res;
            b = 0 if (b < 0) else b;
        } else {
            a = res;
        }
        System.out.println(a + " " + b);
    }
}
```
<|endoftext|>
