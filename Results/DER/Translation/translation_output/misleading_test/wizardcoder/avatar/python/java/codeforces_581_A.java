Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
45 99

Expected output:
47 20

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

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] x = sc.nextLine().split(" ");
        for (int i = 0; i < x.length; i++) {
            x[i] = Integer.parseInt(x[i]);
        }
        int a = x[0];
        int b = x[1];
        System.out.print(Math.min(a, b) + " ");
        if (Math.abs(a - b) >= 2) {
            System.out.print(Math.abs(a - b) / 2);
        } else {
            System.out.print(0);
        }
    }
}
```<|endoftext|>
