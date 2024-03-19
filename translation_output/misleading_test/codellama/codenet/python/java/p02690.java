<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
33

Expected output:
36 87

```
x=int(input())
for i in range(-1000,1000):
  for j in range(-1000,1000):
    if i**5-j**5==x:
      print(i,j)
      break
  else:
    continue
  break
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        for (int i = -1000; i <= 1000; i++) {
            for (int j = -1000; j <= 1000; j++) {
                if (Math.pow(i, 5) - Math.pow(j, 5) == x) {
                    System.out.println(i + " " + j);
                    break;
                }
            }
        }
    }
}
```
This code uses the `Scanner` class to read the input from the user, and then it uses a nested `for` loop to iterate over the range of values from -1000 to 1000 for both `i` and `j`. The `if` statement checks if the difference between the 5th power of `i` and the 5th power of `j` is equal to the input value `x`. If the condition is true, it prints the values of `i` and `j` and breaks out of the loop.

Note that this code assumes that the input value `x` is a positive integer. If the input value can be negative, you may need to modify the code to handle that case as well.</s>
