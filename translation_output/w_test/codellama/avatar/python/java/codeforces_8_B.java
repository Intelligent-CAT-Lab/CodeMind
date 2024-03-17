<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
LUUDU

Expected output:
BUG


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
                temp = "(0," + (Integer.parseInt(temp.substring(2)) - 1) + ")";
            } else if (c == 'R') {
                temp = "(0," + (Integer.parseInt(temp.substring(2)) + 1) + ")";
            } else if (c == 'U') {
                temp = "(" + (Integer.parseInt(temp.substring(1)) - 1) + ",0)";
            } else {
                temp = "(" + (Integer.parseInt(temp.substring(1)) + 1) + ",0)";
            }
            if (coord.contains(temp)) {
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
            int i = Integer.parseInt(s.substring(1));
            int j = Integer.parseInt(s.substring(2));
            for (int p = i + 1; p <= j; p++) {
                for (int q = i - 1; q <= j; q++) {
                    if (coord.contains("(" + p + "," + q + ")")) {
                        coord.remove("(" + p + "," + q + ")");
                        que.add("(" + p + "," + q + ")");
                    }
                }
            }
        }
        System.out.println("OK");
    }
}
```
This code uses the `Scanner` class to read the input from the user, and the `Set` and `Deque` classes to store the coordinates and the queue of coordinates to be processed.

The `coord` set is initialized with the starting coordinate `(0,0)`, and the `temp` variable is used to store the current coordinate.

The `for` loop iterates over the characters in the input string, and for each character, it checks if it is a left, right, up, or down movement. If it is, it updates the `temp` variable accordingly.

If the updated `temp` variable is already in the `coord` set, it means that there is a loop in the path, and the program prints "BUG" and exits.

Otherwise, it adds the updated `temp` variable to the `coord` set and updates the `que` queue with the new coordinate.

After the `for` loop, the starting coordinate `(0,0)` is removed from the `coord` set, and the `que` queue is initialized with the starting coordinate.

The `while` loop iterates over the `que` queue, and for each coordinate in the queue, it checks if there are any other coordinates in the `coord` set that are adjacent to it. If there are, it removes those coordinates from the `coord` set and adds them to the `que` queue.

After the `while` loop, if the `coord` set is empty, it means that there are no loops in the path, and the program prints "OK". Otherwise, it prints "BUG".</s>
