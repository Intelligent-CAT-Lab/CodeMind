<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 1 20 15 17 5

Expected output:
NGO

```
import sys
input = sys. stdin. readline
ii = lambda : int ( input ( ) )
mi = lambda : map ( int, input ( ). split ( ) )
li = lambda : list ( map ( int, input ( ). split ( ) ) )
from collections import defaultdict
d, t, a, b, da, db = mi ( )
def solve ( ) :
    for i in range ( t ) :
        for j in range ( t ) :
            if a - da * i + b - db * j == d or a - da * i == d or b - db * j == d or d == 0 :
                print ('YES')
                return
    print ('NO')
solve ( )


```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int da = sc.nextInt();
        int db = sc.nextInt();
        int d = sc.nextInt();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (a - da * i + b - db * j == d || a - da * i == d || b - db * j == d || d == 0) {
                    System.out.println(" YES ");
                    return;
                }
            }
        }
        System.out.println(" NO ");
    }
}
```
<|endoftext|>
