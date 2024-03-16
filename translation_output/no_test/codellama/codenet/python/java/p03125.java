<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

x,y=map(int,input().split())
if y%x ==0:
  print(x+y)
else:
  print(y-x)

Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (y % x == 0) {
            System.out.println(x + y);
        } else {
            System.out.println(y - x);
        }
    }
}

Note that the Java code uses the `Scanner` class to read input from the user, and the `nextInt()` method to read an integer value from the user. The `if` statement is used to check if the remainder of `y` divided by `x` is equal to 0, and the `else` statement is used to print the result of `y - x` if the condition is not met.</s>
