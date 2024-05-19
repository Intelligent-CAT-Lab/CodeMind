System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
LUUDU

Expected output:
UG

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
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        Set<String> coord = new HashSet<>();
        coord.add("0,0");
        String[] dirs = {"L", "R", "U", "D"};
        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        int x = 0, y = 0;
        for (char c : path.toCharArray()) {
            int dir = Arrays.asList(dirs).indexOf(c);
            x += dx[dir];
            y += dy[dir];
            String pos = x + "," + y;
            if (coord.contains(pos)) {
                System.out.println("BUG");
                return;
            }
            coord.add(pos);
        }
        coord.remove("0,0");
        Queue<String> que = new LinkedList<>();
        que.add("0,0");
        while (!que.isEmpty()) {
            if (que.size() > 1) {
                System.out.println("BUG");
                return;
            }
            String pos = que.poll();
            String[] parts = pos.split(",");
            int x0 = Integer.parseInt(parts[0]);
            int y0 = Integer.parseInt(parts[1]);
            for (int dir = 0; dir < 4; dir++) {
                int x1 = x0 + dx[dir];
                int y1 = y0 + dy[dir];
                String pos1 = x1 + "," + y1;
                if (coord.contains(pos1)) {
                    coord.remove(pos1);
                    que.add(pos1);
                }
            }
        }
        System.out.println("OK");
    }
}
```<|endoftext|>
