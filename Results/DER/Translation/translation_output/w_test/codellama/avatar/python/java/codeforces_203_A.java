<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 1 20 15 17 5

Expected output:
NO


```
import sys
input = sys . stdin . readline
ii = lambda : int ( input ( ) )
mi = lambda : map ( int , input ( ) . split ( ) )
li = lambda : list ( map ( int , input ( ) . split ( ) ) )
from collections import defaultdict
d , t , a , b , da , db = mi ( )
def solve ( ) :
    for i in range ( t ) :
        for j in range ( t ) :
            if a - da * i + b - db * j == d or a - da * i == d or b - db * j == d or d == 0 :
                print ( ' YES ' )
                return
    print ( ' NO ' )
solve ( )


```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int t = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int da = sc.nextInt();
        int db = sc.nextInt();

        for (int i = 0; i < t; i++) {
            for (int j = 0; j < t; j++) {
                if ((a - da * i + b - db * j) == d || (a - da * i) == d || (b - db * j) == d || d == 0) {
                    System.out.println("YES");
                    return;
                }
            }
        }
        System.out.println("NO");
    }
}
```
This is a Java implementation of the provided Python code. It uses the `Scanner` class to read input from the user, and it uses a nested `for` loop to iterate over the values of `i` and `j`. The `if` statement inside the loop checks if the equation `a - da * i + b - db * j == d` is true, and if it is, it prints "YES" and returns from the function. If the equation is not true for any value of `i` and `j`, it prints "NO" and returns from the function.</s>
