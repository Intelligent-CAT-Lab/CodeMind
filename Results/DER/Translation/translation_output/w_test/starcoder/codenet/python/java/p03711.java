<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 3

Expected output:
Yes


```
def main():
    x, y = map(int, input().split())
    a = [1, 3, 5, 7, 8, 10, 12]
    b = [4, 6, 9, 11]
    if x == 2 or y == 2:
        print('No')
    elif (x in a and y in a) or (x in b and y in b):
        print('Yes')
    else:
        print('No')
main()
```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x == 2 || y == 2) {
            System.out.println("No");
        } else if (x == 1 || x == 3 || x == 5 || x == 7 || x == 8 || x == 10 || x == 12 || y == 4 || y == 6 || y == 9 || y == 11) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```
<|endoftext|>
