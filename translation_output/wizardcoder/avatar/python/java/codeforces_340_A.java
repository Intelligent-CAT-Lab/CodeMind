Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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
        String[] l = sc.nextLine().split(" ");
        int x = Integer.parseInt(l[0]);
        int y = Integer.parseInt(l[1]);
        int a = Integer.parseInt(l[2]);
        int b = Integer.parseInt(l[3]);

        int gcd = GCD(x, y);
        int lcm = x * y / gcd;

        System.out.println(b / lcm - (a - 1) / lcm);
    }

    public static int GCD(int a, int b) {
        while (a % b!= 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return b;
    }

    public static int LCM(int a, int b) {
        return a * b / GCD(a, b);
    }
}
```<|endoftext|>
