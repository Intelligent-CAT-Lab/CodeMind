<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
LUUDU

Expected output:
UG

```
from collections import deque
path = input ( )
coord = set ( [ ( 0 , 0 ) ] ) ; temp = ( 0 , 0 )
for c in path :
    if c == ' L ' : temp = ( temp [ 0 ] , temp [ 1 ] - 1 )
    elif c == ' R ' : temp = ( temp [ 0 ] , temp [ 1 ] + 1 )
    elif c == ' U ' : temp = ( temp [ 0 ] - 1 , temp [ 1 ] )
    else : temp = ( temp [ 0 ] + 1 , temp [ 1 ] )
    if temp in coord : print ( ' BUG ' ) ; exit ( )
    coord . add ( temp )
coord . remove ( ( 0 , 0 ) )
que = deque ( [ ( 0 , 0 ) ] )
while que :
    if len ( que ) > 1 : print ( ' BUG ' ) ; exit ( )
    i , j = que . popleft ( )
    for p , q in ( i + 1 , j ) , ( i - 1 , j ) , ( i , j + 1 ) , ( i , j - 1 ) :
        if ( p , q ) in coord :
            coord . remove ( ( p , q ) )
            que += ( p , q ) ,
print ( ' OK ' )


```
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        Set<int[]> coord = new HashSet<>();
        int[] temp = {0, 0};
        for (char c : path.toCharArray()) {
            if (c == ' L') {
                temp = new int[]{temp[0], temp[1] - 1};
            } else if (c == ' R') {
                temp = new int[]{temp[0], temp[1] + 1};
            } else if (c == ' U') {
                temp = new int[]{temp[0] - 1, temp[1]};
            } else {
                temp = new int[]{temp[0] + 1, temp[1]};
            }
            if (Arrays.equals(temp, coord.iterator().next())) {
                System.out.println("BUG");
                return;
            }
            coord.add(temp);
        }
        coord.remove(new int[]{0, 0});
        Deque<int[]> que = new ArrayDeque<>(Arrays.asList(new int[]{0, 0}));
        while (!que.isEmpty()) {
            if (que.size() > 1) {
                System.out.println("BUG");
                return;
            }
            int[] p = que.poll();
            for (int[] q : new int[][]{p[0] + 1, p[1], p[0] - 1, p[1]}) {
                if (Arrays.equals(q, coord.iterator().next())) {
                    coord.remove(q);
                    que.add(q);
                }
            }
        }
        System.out.println("OK");
    }
}
```</s>
