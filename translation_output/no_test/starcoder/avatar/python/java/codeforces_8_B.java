<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
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

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = sc.next();
        Set<Integer> coord = new HashSet<>();
        coord.add(0);
        int temp = 0;
        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == 'L') {
                temp = temp - 1;
            } else if (path.charAt(i) == 'R') {
                temp = temp + 1;
            } else if (path.charAt(i) == 'U') {
                temp = temp - 10;
            } else {
                temp = temp + 10;
            }
            if (coord.contains(temp)) {
                System.out.println("BUG");
                return;
            }
            coord.add(temp);
        }
        coord.remove(0);
        Queue<Integer> que = new LinkedList<>();
        que.add(0);
        while (!que.isEmpty()) {
            if (que.size() > 1) {
                System.out.println("BUG");
                return;
            }
            int i = que.poll();
            for (int p = i + 1; p < 100; p++) {
                if (coord.contains(p)) {
                    coord.remove(p);
                    que.add(p);
                    break;
                }
            }
            for (int p = i - 1; p >= 0; p--) {
                if (coord.contains(p)) {
                    coord.remove(p);
                    que.add(p);
                    break;
                }
            }
            for (int p = i + 10; p < 1000; p += 10) {
                if (coord.contains(p)) {
                    coord.remove(p);
                    que.add(p);
                    break;
                }
            }
            for (int p = i - 10; p >= 0; p -= 10) {
                if (coord.contains(p)) {
                    coord.remove(p);
                    que.add(p);
                    break;
                }
            }
        }
        System.out.println("OK");
    }
}
```
<|endoftext|>
