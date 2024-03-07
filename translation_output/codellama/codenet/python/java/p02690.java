<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

x=int(input())
for i in range(-1000,1000):
  for j in range(-1000,1000):
    if i**5-j**5==x:
      print(i,j)
      break
  else:
    continue
  break

Translate the above python code to java.

java code:

[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        for (int i = -1000; i <= 1000; i++) {
            for (int j = -1000; j <= 1000; j++) {
                if (i * i * i * i * i - j * j * j * j * j == x) {
                    System.out.println(i + " " + j);
                    break;
                }
            }
        }
    }
}
```
This is the Java code that translates the Python code you provided. It uses the `Scanner` class to read input from the user, and then it uses nested `for` loops to iterate over the range of values for `i` and `j`. The `if` statement checks if the difference between `i` and `j` raised to the fifth power is equal to the input value `x`. If it is, the program prints the values of `i` and `j` and then breaks out of the inner loop. If the condition is not met, the program continues to the next iteration of the inner loop.

Note that the `break` statements are used to exit the loops when the condition is met, and the `else` clause is used to continue to the next iteration of the inner loop if the condition is not met.</s>
