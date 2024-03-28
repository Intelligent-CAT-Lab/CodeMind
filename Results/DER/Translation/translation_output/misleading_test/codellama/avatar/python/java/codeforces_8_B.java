<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

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
[/INST]
```java
import java.util.Scanner;
import java.util.Set;
import java.util.Deque;
import java.util.ArrayDeque;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        Set<String> coord = new HashSet<>();
        coord.add("(0,0)");
        String temp = "(0,0)";
        for (int i = 0; i < path.length(); i++) {
            char c = path.charAt(i);
            if (c == 'L') {
                temp = "(temp[0], temp[1] - 1)";
            } else if (c == 'R') {
                temp = "(temp[0], temp[1] + 1)";
            } else if (c == 'U') {
                temp = "(temp[0] - 1, temp[1])";
            } else {
                temp = "(temp[0] + 1, temp[1])";
            }
            if (temp.equals("(0,0)")) {
                System.out.println("BUG");
                return;
            }
            coord.add(temp);
        }
        coord.remove("(0,0)");
        Deque<String> que = new ArrayDeque<>();
        que.add("(0,0)");
        while (!que.isEmpty()) {
            String s = que.pop();
            if (s.equals("(0,0)")) {
                System.out.println("BUG");
                return;
            }
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == 'L') {
                    que.add("(temp[0], temp[1] - 1)");
                } else if (c == 'R') {
                    que.add("(temp[0], temp[1] + 1)");
                } else if (c == 'U') {
                    que.add("(temp[0] - 1, temp[1])");
                } else {
                    que.add("(temp[0] + 1, temp[1])");
                }
            }
        }
        System.out.println("OK");
    }
}
```
This is a solution to the problem you provided. It uses a `Set` to keep track of the coordinates that have been visited, and a `Deque` to keep track of the coordinates that still need to be visited. The `main` method first reads in the input string and initializes the `Set` and `Deque` with the starting coordinate. It then iterates through the input string, updating the `Set` and `Deque` as it goes. If it encounters a coordinate that has already been visited, it prints "BUG" and exits. If it reaches the end of the input string and the `Deque` is not empty, it prints "BUG" and exits. Otherwise, it prints "OK".</s>
