<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
100 10000

Expected output:
NO


```
numbers = list ( map ( int, input ( ). split ( ) ) )
start = 0
arr = [ ]
count = 0
for i in range ( 0, numbers [ 0 ] ) :
    string = " "
    next = start
    for j in range ( 0, numbers [ 0 ] ) :
        if count < numbers [ 1 ] :
            if j == next :
                string +='L '
                count += 1
                next += 2
                if next >= numbers [ 0 ] :
                    start = 1 if start == 0 else 0
            else :
                string += " S "
        else :
            string += " S "
    arr. append ( string )
if count < numbers [ 1 ] :
    print ( " NO " )
else :
    print ( " YES " )
    for i in arr :
        print ( i )


```

java code:<fim_suffix><fim_middle>

```
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[2];
        numbers[0] = sc.nextInt();
        numbers[1] = sc.nextInt();
        int start = 0;
        int count = 0;
        for (int i = 0; i < numbers[0]; i++) {
            String string = " ";
            int next = start;
            for (int j = 0; j < numbers[0]; j++) {
                if (count < numbers[1]) {
                    if (j == next) {
                        string += 'L';
                        count++;
                        next += 2;
                        if (next >= numbers[0]) {
                            start = 1 if start == 0 else 0;
                        }
                    } else {
                        string += "S";
                    }
                } else {
                    string += "S";
                }
            }
            System.out.println(string);
        }
        if (count < numbers[1]) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
```
<|endoftext|>
