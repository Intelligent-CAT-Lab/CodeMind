<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 5 2 7

Expected output:
15


```
a,b,c,d = map(int, input().split())
s = a*b
t = c*d
if s > t: print(s)
else: print(t)
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        int d = Integer.parseInt(input[3]);
        int s = a * b;
        int t = c * d;
        if (s > t) {
            System.out.println(s);
        } else {
            System.out.println(t);
        }
    }
}
```
Note: The `Scanner` class is used to read input from the user, and the `split()` method is used to split the input string into an array of strings based on the specified delimiter (in this case, a space). The `parseInt()` method is used to convert each string in the array to an integer.</s>
