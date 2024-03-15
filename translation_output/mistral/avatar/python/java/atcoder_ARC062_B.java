<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
import sys
input = lambda : sys . stdin . readline ( ) . rstrip ( )
sys . setrecursionlimit ( 10 ** 9 )
def pin ( type = int ) : return map ( type , input ( ) . split ( ) )
def tupin ( t = int ) : return tuple ( pin ( t ) )
def lispin ( t = int ) : return list ( pin ( t ) )
from collections import Counter
def resolve ( ) :
    S = input ( )
    c = Counter ( S )
    print ( ( c [ " g " ] - c [ " p " ] ) // 2 )
resolve ( )


```
[/INST]
```java
import java.util.*;
import java.io.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int limit = 100000000;

    static int[] pin(int type) {
        String[] input = sc.nextLine().split(" ");
        int[] result = new int[type];
        for (int i = 0; i < type; i++) {
            result[i] = Integer.parseInt(input[i]);
        }
        return result;
    }

    static List<Integer> lispin(int type) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < type; i++) {
            result.add(pin(type)[i]);
        }
        return result;
    }

    static void resolve() {
        String S = sc.nextLine();
        Map<Character, Integer> c = new HashMap<>();
        for (int i = 0; i < S.length(); i++) {
            c.put(S.charAt(i), c.getOrDefault(S.charAt(i), 0) + 1);
        }
        int result = (c.get("g") - c.get("p")) / 2;
        System.out.println(result);
    }

    public static void main(String[] args) {
        resolve();
    }
}
```</s>
