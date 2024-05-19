System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
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
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (c == 'g' || c == 'G') {
                map.put('g', map.getOrDefault('g', 0) + 1);
            } else if (c == 'p' || c == 'P') {
                map.put('p', map.getOrDefault('p', 0) + 1);
            }
        }
        int count = (map.getOrDefault('g', 0) - map.getOrDefault('p', 0)) / 2;
        System.out.println(count);
    }
}
```<|endoftext|>
