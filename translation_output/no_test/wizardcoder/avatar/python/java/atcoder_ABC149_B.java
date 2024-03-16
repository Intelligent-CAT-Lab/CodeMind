Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        int a = Integer.parseInt(number.split(" ")[0]);
        int b = Integer.parseInt(number.split(" ")[1]);
        int k = Integer.parseInt(number.split(" ")[2]);
        int res = a - k;
        if (res < 0) {
            a = 0;
            b += res;
            b = b < 0? 0 : b;
        } else {
            a = res;
        }
        System.out.println(a + " " + b);
    }
}
```<|endoftext|>
