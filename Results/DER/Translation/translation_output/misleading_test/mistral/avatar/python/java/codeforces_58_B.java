<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
733035

Expected output:
732989 244387 48927 23

```
a = int ( input ( ) )
for i in range ( a , 0 , - 1 ) :
    if a % i == 0 :
        print ( i , end = ' â ' )
        a = i


```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = a; i > 1; i--) {
            if (a % i == 0) {
                System.out.print(i + "  ");
                a = i;
            }
        }
    }
}
```

Sample test case:

Test input:
733035

Expected output:
732989 244387 48927 23</s>
