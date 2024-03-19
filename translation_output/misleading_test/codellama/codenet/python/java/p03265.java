<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0 0 0 1

Expected output:
-24 64 -99 -38

```
a,s,d,f=map(int,input().split())
x3=d-f+s
y3=f+d-a
x4=a-f+s
y4=s+d-a
print(x3,y3,x4,y4)
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int s = Integer.parseInt(input[1]);
        int d = Integer.parseInt(input[2]);
        int f = Integer.parseInt(input[3]);

        int x3 = d - f + s;
        int y3 = f + d - a;
        int x4 = a - f + s;
        int y4 = s + d - a;

        System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `split()` method to split the input into an array of strings. The `map()` method is then used to convert each string in the array to an integer.

The rest of the code is similar to the Python code, with the variables `x3`, `y3`, `x4`, and `y4` being calculated using the same formulas as in the Python code. Finally, the results are printed to the console using the `System.out.println()` method.</s>
