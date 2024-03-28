Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
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

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int abs_x = Math.abs(x);
        int abs_y = Math.abs(y);

        if (0 <= x && x < y) {
            System.out.println(y - x);
            return;
        }
        if (0 < y && y < x) {
            System.out.println(x - y + 2);
            return;
        }
        if (y == 0 && x > 0) {
            System.out.println(x + 1);
            return;
        }

        if (x < y && y <= 0) {
            System.out.println(y - x);
            return;
        }
        if (y < x && x < 0) {
            System.out.println(x - y + 2);
            return;
        }
        if (x == 0 && y < 0) {
            System.out.println(abs_y + 1);
            return;
        }

        if (x < 0 && 0 < y) {
            System.out.println(Math.abs(abs_y - abs_x) + 1);
            return;
        }
        if (y < 0 && 0 < x) {
            System.out.println(Math.abs(abs_y - abs_x) + 1);
            return;
        }
    }
}
```<|endoftext|>
