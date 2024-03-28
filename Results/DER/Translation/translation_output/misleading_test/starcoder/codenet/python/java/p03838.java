<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10 20

Expected output:
103

```
x, y = map(int, input().split())
abs_x = abs(x)
abs_y = abs(y)

if 0 <= x < y:
    print (y - x)
    exit()
if 0 < y < x:
    print (x - y + 2)
    exit()
if y == 0 and 0 < x:
    print (x + 1)
    exit()

if x < y <= 0:
    print (y - x)
    exit()
if y < x < 0:
    print (x - y + 2)
    exit()
if x == 0 and y < 0:
    print (abs_y + 1)
    
if x < 0  < y:
    print (abs(abs_y - abs_x) + 1)
    exit()
if y < 0 < x:
    print (abs(abs_y - abs_x) + 1)
    exit()



```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int abs_x = Math.abs(x);
        int abs_y = Math.abs(y);
        if (x == 0 && y == 0) {
            System.out.println(0);
            return;
        }
        if (x == 0) {
            System.out.println(y + 1);
            return;
        }
        if (y == 0) {
            System.out.println(x + 1);
            return;
        }
        if (x == y) {
            System.out.println(2 * x);
            return;
        }
        if (x == -y) {
            System.out.println(2 * abs_x);
            return;
        }
        if (x > 0 && y > 0) {
            System.out.println(y - x);
            return;
        }
        if (x < 0 && y > 0) {
            System.out.println(y - x + 2);
            return;
        }
        if (x < 0 && y < 0) {
            System.out.println(x - y + 2);
            return;
        }
        if (x > 0 && y < 0) {
            System.out.println(x - y);
            return;
        }
    }
}
```
<|endoftext|>
