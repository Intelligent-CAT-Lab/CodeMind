<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

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

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.next();
        Set<String> coord = new HashSet<>();
        coord.add("0,0");
        String[] temp = {"0", "0"};
        for (char c : path.toCharArray()) {
            if (c == 'L') temp[1] = String.valueOf(Integer.parseInt(temp[1]) - 1);
            else if (c == 'R') temp[1] = String.valueOf(Integer.parseInt(temp[1]) + 1);
            else if (c == 'U') temp[0] = String.valueOf(Integer.parseInt(temp[0]) - 1);
            else temp[0] = String.valueOf(Integer.parseInt(temp[0]) + 1);
            if (coord.contains(temp[0] + "," + temp[1])) {
                System.out.println("BUG");
                System.exit(0);
            }
            coord.add(temp[0] + "," + temp[1]);
        }
        coord.remove("0,0");
        Queue<String> que = new LinkedList<>();
        que.add("0,0");
        while (!que.isEmpty()) {
            if (que.size() > 1) {
                System.out.println("BUG");
                System.exit(0);
            }
            String[] current = que.poll().split(",");
            int i = Integer.parseInt(current[0]), j = Integer.parseInt(current[1]);
            if (coord.contains((i + 1) + "," + j) && coord.remove((i + 1) + "," + j)) que.add((i + 1) + "," + j);
            if (coord.contains((i - 1) + "," + j) && coord.remove((i - 1) + "," + j)) que.add((i - 1) + "," + j);
            if (coord.contains(i + "," + (j + 1)) && coord.remove(i + "," + (j + 1))) que.add(i + "," + (j + 1));
            if (coord.contains(i + "," + (j - 1)) && coord.remove(i + "," + (j - 1))) que.add(i + "," + (j - 1));
        }
        System.out.println("OK");
    }
}
```

This Java code does the same thing as the Python code. It reads a string of characters representing a path, and then checks if the path is valid. If the path is not valid, it prints "BUG" and exits. If the path is valid, it prints "OK".
<|EOT|>
