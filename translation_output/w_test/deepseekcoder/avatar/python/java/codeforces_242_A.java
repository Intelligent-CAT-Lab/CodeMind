<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 5 3 2

Expected output:
6
3 2
4 2
4 3
5 2
5 3
5 4


```
x , y , a , b = [ int ( i ) for i in input ( ) . split ( ) ]
c = [ [ i , j ] for i in range ( a , x + 1 ) for j in range ( b , y + 1 ) if i > j ]
print ( len ( c ) ) ; [ print ( * i ) for i in c ]


```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        List<List<Integer>> c = new ArrayList<>();
        for (int i = a; i <= x; i++) {
            for (int j = b; j <= y; j++) {
                if (i > j) {
                    List<Integer> pair = new ArrayList<>();
                    pair.add(i);
                    pair.add(j);
                    c.add(pair);
                }
            }
        }

        System.out.println(c.size());
        for (List<Integer> pair : c) {
            System.out.println(pair.get(0) + " " + pair.get(1));
        }
    }
}
```

This Java code does the same thing as the Python code. It reads four integers from the input, generates all pairs of integers `(i, j)` such that `a <= i <= x` and `b <= j <= y` and `i > j`, and prints the number of such pairs and the pairs themselves.
<|EOT|>
