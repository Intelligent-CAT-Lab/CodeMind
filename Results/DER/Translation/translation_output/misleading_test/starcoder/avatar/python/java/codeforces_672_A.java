<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
952

Expected output:
-34

```
li = [ ]
ind = 0
for i in range ( 1, 371 ) :
    temp = [ ]
    p, q = i, i
    count = 0
    while p!= 0 :
        p //= 10
        count += 1
    if count == 1 :
        li. append ( i )
    if count == 2 :
        temp = [ ]
        while q!= 0 :
            x = q % 10
            q //= 10
            temp. append ( x )
        li = li + temp [ : : - 1 ]
    if count == 3 :
        temp = [ ]
        while q!= 0 :
            x = q % 10
            q //= 10
            temp. append ( x )
        li = li + temp [ : : - 1 ]
li. pop ( )
li. pop ( )
n = int ( input ('' ) )
print ( li [ n - 1 ] )


```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] li = new int[370];
        int ind = 0;
        for (int i = 1; i < 371; i++) {
            int p = i, q = i;
            int count = 0;
            while (p!= 0) {
                p /= 10;
                count++;
            }
            if (count == 1) {
                li[ind] = i;
                ind++;
            }
            if (count == 2) {
                int[] temp = new int[count];
                while (q!= 0) {
                    int x = q % 10;
                    q /= 10;
                    temp[count - 1] = x;
                    count--;
                }
                for (int j = 0; j < count; j++) {
                    li[ind] = temp[j];
                    ind++;
                }
            }
            if (count == 3) {
                int[] temp = new int[count];
                while (q!= 0) {
                    int x = q % 10;
                    q /= 10;
                    temp[count - 1] = x;
                    count--;
                }
                for (int j = 0; j < count; j++) {
                    li[ind] = temp[j];
                    ind++;
                }
            }
        }
        li[ind - 2] = 0;
        li[ind - 1] = 0;
        System.out.println(li[n - 1]);
    }
}
```
<|endoftext|>
