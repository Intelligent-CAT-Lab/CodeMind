<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0

Expected output:
0


```
s = input ( )
num_0 = 0
num_1 = 0
for i in range ( len ( s ) ) :
    if s [ i ] == "0" :
        num_0 += 1
    else :
        num_1 += 1
print ( min ( num_0 , num_1 ) * 2 )


```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int num_0 = 0;
        int num_1 = 0;
        for (int i = 0; i < s; i++) {
            if (s % 10 == 0) {
                num_0++;
            } else {
                num_1++;
            }
        }
        System.out.println(Math.min(num_0, num_1) * 2);
    }
}
```</s>
