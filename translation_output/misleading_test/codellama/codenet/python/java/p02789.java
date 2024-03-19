<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 3

Expected output:
64s

```
a = [int(i) for i in input().split()]
if a[0] == a[1]:
  print('Yes')
else:
  print('No')
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[2];
        for (int i = 0; i < 2; i++) {
            a[i] = sc.nextInt();
        }
        if (a[0] == a[1]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```
This code uses the `Scanner` class to read input from the user, and then it splits the input into two integers using the `split()` method. It then checks if the two integers are equal using the `==` operator, and if they are, it prints "Yes", otherwise it prints "No".</s>
