<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
100 25

Expected output:
156

```
a1 , a2 = map ( int , input ( ) . split ( ) )
t = 0
if a1 == 1 and a2 == 1 :
    print ( 0 )
else :
    while a1 > 0 and a2 > 0 :
        if a1 > a2 :
            a2 += 1
            a1 -= 2
        else :
            a2 -= 2
            a1 += 1
        t += 1
    print ( t )


```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a1, a2;
        a1 = Integer.parseInt(scanner.nextLine().split(" ")[0]);
        a2 = Integer.parseInt(scanner.nextLine().split(" ")[0]);
        int t = 0;
        if (a1 == 1 && a2 == 1) {
            t = 0;
        } else {
            while (a1 > 0 && a2 > 0) {
                if (a1 > a2) {
                    a2++;
                    a1--;
                } else {
                    a2--;
                    a1++;
                }
                t++;
            }
        }
        System.out.println(t);
    }
}
```</s>
