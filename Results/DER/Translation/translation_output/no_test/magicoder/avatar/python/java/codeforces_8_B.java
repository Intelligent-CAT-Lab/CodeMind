<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
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

@@ Response
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        Set<Pair<Integer, Integer>> coord = new HashSet<>();
        coord.add(new Pair<>(0, 0));
        Pair<Integer, Integer> temp = new Pair<>(0, 0);
        for (char c : path.toCharArray()) {
            if (c == 'L') {
                temp = new Pair<>(temp.getKey(), temp.getValue() - 1);
            } else if (c == 'R') {
                temp = new Pair<>(temp.getKey(), temp.getValue() + 1);
            } else if (c == 'U') {
                temp = new Pair<>(temp.getKey() - 1, temp.getValue());
            } else {
                temp = new Pair<>(temp.getKey() + 1, temp.getValue());
            }
            if (coord.contains(temp)) {
                System.out.println("BUG");
                System.exit(0);
            }
            coord.add(temp);
        }
        coord.remove(new Pair<>(0, 0));
        Deque<Pair<Integer, Integer>> que = new ArrayDeque<>();
        que.add(new Pair<>(0, 0));
        while (!que.isEmpty()) {
            if (que.size() > 1) {
                System.out.println("BUG");
                System.exit(0);
            }
            Pair<Integer, Integer> pair = que.poll();
            int i = pair.getKey();
            int j = pair.getValue();
            for (Pair<Integer, Integer> pq : Arrays.asList(new Pair<>(i + 1, j), new Pair<>(i - 1, j), new Pair<>(i, j + 1), new Pair<>(i, j - 1))) {
                if (coord.contains(pq)) {
                    coord.remove(pq);
                    que.add(pq);
                }
            }
        }
        System.out.println("OK");
    }
}

class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(key, pair.key) && Objects.equals(value, pair.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }
}
```

This Java code does the same thing as the Python code. It reads a string of characters from the user, simulates a robot moving in a grid, and checks if the robot ever visits the same cell twice. If it does, it prints "BUG" and exits. If it never visits the same cell twice, it prints "OK".<｜end▁of▁sentence｜>
