Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 1 1 1000000000

Expected output:
1000000000

```
def GCD ( a, b ) :
    while a % b!= 0 :
        a, b = b, a % b
    return b
def LCM ( a, b ) :
    return a * b // GCD ( a, b )
l = input ( ). split ('â')
x, y, a, b = int ( l [ 0 ] ), int ( l [ 1 ] ), int ( l [ 2 ] ), int ( l [ 3 ] )
lcm = LCM ( x, y )
print ( b // lcm - ( a - 1 ) // lcm )


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        int a = Integer.parseInt(input[2]);
        int b = Integer.parseInt(input[3]);

        int gcd = 1;
        while (y!= 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        gcd = x;

        int lcm = (x * y) / gcd;

        int result = b / lcm - (a - 1) / lcm;

        System.out.println(result);
    }
}
```<|endoftext|>
