Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
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

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        Set<Tuple> coord = new HashSet<>();
        coord.add(new Tuple(0, 0));
        Tuple temp = new Tuple(0, 0);
        for (char c : path.toCharArray()) {
            if (c == 'L') {
                temp = new Tuple(temp.x, temp.y - 1);
            } else if (c == 'R') {
                temp = new Tuple(temp.x, temp.y + 1);
            } else if (c == 'U') {
                temp = new Tuple(temp.x - 1, temp.y);
            } else {
                temp = new Tuple(temp.x + 1, temp.y);
            }
            if (coord.contains(temp)) {
                System.out.println(" BUG ");
                return;
            }
            coord.add(temp);
        }
        coord.remove(new Tuple(0, 0));
        Queue<Tuple> que = new LinkedList<>();
        que.offer(new Tuple(0, 0));
        while (!que.isEmpty()) {
            Tuple t = que.poll();
            if (coord.size() > 1) {
                System.out.println(" BUG ");
                return;
            }
            for (Tuple p : new Tuple[]{new Tuple(t.x + 1, t.y), new Tuple(t.x - 1, t.y), new Tuple(t.x, t.y + 1), new Tuple(t.x, t.y - 1)}) {
                if (coord.contains(p)) {
                    coord.remove(p);
                    que.offer(p);
                }
            }
        }
        System.out.println(" OK ");
    }
}

class Tuple {
    int x, y;

    public Tuple(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass()!= o.getClass()) return false;
        Tuple tuple = (Tuple) o;
        return x == tuple.x && y == tuple.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
```<|endoftext|>
