Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
s = input ( )
num_0 = 0
num_1 = 0
for i in range ( len ( s ) ) :
    if s [ i ] == "0" :
        num_0 += 1
    else :
        num_1 += 1
print ( min ( num_0, num_1 ) * 2 )


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int num_0 = 0;
        int num_1 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                num_0++;
            } else {
                num_1++;
            }
        }
        System.out.println(Math.min(num_0, num_1) * 2);
    }
}
```<|endoftext|>
