<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
13 3 1

Expected output:
3


```
X,Y,Z=map(int,input().split())

answer=0
width=Y+2*Z
while(width<=X):
  answer+=1
  width+=Y+Z
  
print(answer)
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();
        int answer = 0;
        int width = Y + 2 * Z;
        while (width <= X) {
            answer++;
            width += Y + Z;
        }
        System.out.println(answer);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `int` class to convert the input to integers. The `while` loop is used to calculate the number of times the width is less than or equal to `X`. The `answer` variable is incremented each time the loop is executed, and the `width` variable is updated to reflect the new width. Finally, the `System.out.println` method is used to print the final value of `answer`.</s>
