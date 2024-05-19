System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
from collections import deque
path = input ( )
coord = set ( [ ( 0, 0 ) ] ) ; temp = ( 0, 0 )
for c in path :
    if c =='L': temp = ( temp [ 0 ], temp [ 1 ] - 1 )
    elif c =='R': temp = ( temp [ 0 ], temp [ 1 ] + 1 )
    elif c =='U': temp = ( temp [ 0 ] - 1, temp [ 1 ] )
    else : temp = ( temp [ 0 ] + 1, temp [ 1 ] )
    if temp in coord : print ('BUG') ; exit ( )
    coord. add ( temp )
coord. remove ( ( 0, 0 ) )
que = deque ( [ ( 0, 0 ) ] )
while que :
    if len ( que ) > 1 : print ('BUG') ; exit ( )
    i, j = que. popleft ( )
    for p, q in ( i + 1, j ), ( i - 1, j ), ( i, j + 1 ), ( i, j - 1 ) :
        if ( p, q ) in coord :
            coord. remove ( ( p, q ) )
            que += ( p, q ),
print ('OK')


```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        Set<String> coord = new HashSet<>();
        coord.add("0,0");
        String[] dirs = path.split("");
        String[] temp = {"0", "0"};
        for (String dir : dirs) {
            if (dir.equals("L")) {
                temp[1] = String.valueOf(Integer.parseInt(temp[1]) - 1);
            } else if (dir.equals("R")) {
                temp[1] = String.valueOf(Integer.parseInt(temp[1]) + 1);
            } else if (dir.equals("U")) {
                temp[0] = String.valueOf(Integer.parseInt(temp[0]) - 1);
            } else {
                temp[0] = String.valueOf(Integer.parseInt(temp[0]) + 1);
            }
            String point = temp[0] + "," + temp[1];
            if (coord.contains(point)) {
                System.out.println("BUG");
                return;
            }
            coord.add(point);
        }
        coord.remove("0,0");
        Queue<String> que = new LinkedList<>();
        que.add("0,0");
        while (!que.isEmpty()) {
            if (que.size() > 1) {
                System.out.println("BUG");
                return;
            }
            String[] cur = que.poll().split(",");
            String[] up = {String.valueOf(Integer.parseInt(cur[0]) - 1), cur[1]};
            String[] down = {String.valueOf(Integer.parseInt(cur[0]) + 1), cur[1]};
            String[] left = {cur[0], String.valueOf(Integer.parseInt(cur[1]) - 1)};
            String[] right = {cur[0], String.valueOf(Integer.parseInt(cur[1]) + 1)};
            if (coord.contains(up[0] + "," + up[1])) {
                coord.remove(up[0] + "," + up[1]);
                que.add(up[0] + "," + up[1]);
            }
            if (coord.contains(down[0] + "," + down[1])) {
                coord.remove(down[0] + "," + down[1]);
                que.add(down[0] + "," + down[1]);
            }
            if (coord.contains(left[0] + "," + left[1])) {
                coord.remove(left[0] + "," + left[1]);
                que.add(left[0] + "," + left[1]);
            }
            if (coord.contains(right[0] + "," + right[1])) {
                coord.remove(right[0] + "," + right[1]);
                que.add(right[0] + "," + right[1]);
            }
        }
        System.out.println("OK");
    }
}
```<|endoftext|>
