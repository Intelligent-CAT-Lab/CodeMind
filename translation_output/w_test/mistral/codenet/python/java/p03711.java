<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
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
[/INST]
```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int[] a = {1, 3, 5, 7, 8, 10, 12};
        int[] b = {4, 6, 9, 11};
        if (x == 2 || y == 2) {
            System.out.println("No");
        } else if (Arrays.asList(a).contains(x) && Arrays.asList(a).contains(y)) {
            System.out.println("Yes");
        } else if (Arrays.asList(b).contains(x) && Arrays.asList(b).contains(y)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```</s>
