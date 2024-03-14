Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int t = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int da = sc.nextInt();
        int db = sc.nextInt();
        sc.close();

        for (int i = 0; i < t; i++) {
            for (int j = 0; j < t; j++) {
                if (a - da * i + b - db * j == d || a - da * i == d || b - db * j == d || d == 0) {
                    System.out.println(" YES ");
                    return;
                }
            }
        }
        System.out.println(" NO ");
    }
}
```<|endoftext|>
