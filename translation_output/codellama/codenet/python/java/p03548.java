<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

X,Y,Z=map(int,input().split())

answer=0
width=Y+2*Z
while(width<=X):
  answer+=1
  width+=Y+Z
  
print(answer)

Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        int Z = scanner.nextInt();

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
Note that the `Scanner` class is used to read input from the user, and the `nextInt()` method is used to read an integer value from the user. The `System.out.println()` method is used to print the output to the console.</s>
