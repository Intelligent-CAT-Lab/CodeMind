<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0 0

Expected output:
1


```
def search(x, y):
    x_min = 0
    y_min = 0
    x_max = 0
    y_max = 0
    f = 0
    f1 = 1
    f2 = 0
    p = 0
    while(True):
        if ( x_min <= x and x <= x_max and
             y_min <= y and y <= y_max  ): return p%3 + 1
        f = f1 + f2
        if ( p % 4 == 0 ):  x_max += f  # east
        elif ( p % 4 == 1 ): y_max += f # north
        elif ( p % 4 == 2 ): x_min -= f # west
        else:  y_min -= f               # south
        f2 = f1
        f1 = f
        p = p + 1

x,y = map(int, input().split())
print(search(x, y))



```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(search(x, y));
    }
    public static int search(int x, int y) {
        int x_min = 0;
        int y_min = 0;
        int x_max = 0;
        int y_max = 0;
        int f = 0;
        int f1 = 1;
        int f2 = 0;
        int p = 0;
        while(true) {
            if ( x_min <= x && x <= x_max &&
                 y_min <= y && y <= y_max  ) return p%3 + 1;
            f = f1 + f2;
            if ( p % 4 == 0 )  x_max += f; // east
            else if ( p % 4 == 1 ) y_max += f; // north
            else if ( p % 4 == 2 ) x_min -= f; // west
            else y_min -= f; // south
            f2 = f1;
            f1 = f;
            p = p + 1;
        }
    }
}
```
<|endoftext|>
