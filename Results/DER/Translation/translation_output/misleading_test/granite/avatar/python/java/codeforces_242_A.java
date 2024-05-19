System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 5 3 2

Expected output:
6
4 2
4 3
5 2
5 3
5 4

```
x, y, a, b = [ int ( i ) for i in input ( ). split ( ) ]
c = [ [ i, j ] for i in range ( a, x + 1 ) for j in range ( b, y + 1 ) if i > j ]
print ( len ( c ) ) ; [ print ( * i ) for i in c ]


```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
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

Test input:
5 5 3 2

Expected output:
6
4 2
4 3
5 2
5 3
5 4<|endoftext|>
