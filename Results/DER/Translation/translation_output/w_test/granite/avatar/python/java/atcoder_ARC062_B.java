System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2

Expected output:
2


```
import sys
input = lambda : sys. stdin. readline ( ). rstrip ( )
sys. setrecursionlimit ( 10 ** 9 )
def pin ( type = int ) : return map ( type, input ( ). split ( ) )
def tupin ( t = int ) : return tuple ( pin ( t ) )
def lispin ( t = int ) : return list ( pin ( t ) )
from collections import Counter
def resolve ( ) :
    S = input ( )
    c = Counter ( S )
    print ( ( c [ " g " ] - c [ " p " ] ) // 2 )
resolve ( )


```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int gCount = 0;
        int pCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'g') {
                gCount++;
            } else if (s.charAt(i) == 'p') {
                pCount++;
            }
        }
        System.out.println((gCount - pCount) / 2);
    }
}
```

Test input:
```
ggppgg
```

Expected output:
```
2
```<|endoftext|>
