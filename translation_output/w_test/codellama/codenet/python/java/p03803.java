<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
8 6

Expected output:
Alice


```
a,b = [int(x) for x in input().split()]
j = [2,3,4,5,6,7,8,9,10,11,12,13,1]
if j.index(a) > j.index(b):
  print('Alice')
elif j.index(a) < j.index(b):
  print('Bob')
else:
  print('Draw')

```
[/INST]
```java
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[] j = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 1};
        if (j.indexOf(a) > j.indexOf(b)) {
            System.out.println("Alice");
        } else if (j.indexOf(a) < j.indexOf(b)) {
            System.out.println("Bob");
        } else {
            System.out.println("Draw");
        }
    }
}
```
Note: The `Scanner` class is used to read input from the user, and the `indexOf` method is used to find the index of an element in an array.</s>
