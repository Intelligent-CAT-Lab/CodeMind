<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
100 10000

Expected output:
NO


```
numbers = list ( map ( int , input ( ) . split ( ) ) )
start = 0
arr = [ ]
count = 0
for i in range ( 0 , numbers [ 0 ] ) :
    string = " "
    next = start
    for j in range ( 0 , numbers [ 0 ] ) :
        if count < numbers [ 1 ] :
            if j == next :
                string += ' L '
                count += 1
                next += 2
                if next >= numbers [ 0 ] :
                    start = 1 if start == 0 else 0
            else :
                string += " S "
        else :
            string += " S "
    arr . append ( string )
if count < numbers [ 1 ] :
    print ( " NO " )
else :
    print ( " YES " )
    for i in arr :
        print ( i )


```
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[2];
        for (int i = 0; i < 2; i++) {
            numbers[i] = sc.nextInt();
        }
        String result = "";
        for (int i = 0; i < numbers[0]; i++) {
            result = "";
            int next = 0;
            for (int j = 0; j < numbers[0]; j++) {
                if (result.length() < numbers[1]) {
                    if (j == next) {
                        result += " L ";
                        next++;
                        if (next >= numbers[0]) {
                            next = 0;
                        }
                    } else {
                        result += " S ";
                    }
                } else {
                    result += " S ";
                }
            }
            result += "\n";
        }
        if (result.length() < numbers[1]) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            System.out.println(result);
        }
    }
}
```</s>
