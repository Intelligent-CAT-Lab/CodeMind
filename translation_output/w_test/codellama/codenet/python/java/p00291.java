<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 1 4 0 4 1

Expected output:
0


```
c1, c5, c10, c50, c100, c500 = map(int, input().split())
sum = c1 + c5*5 + c10*10 + c50*50 + c100*100 + c500*500
print(1 if sum >= 1000 else 0)

```
[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int c1 = Integer.parseInt(input[0]);
        int c5 = Integer.parseInt(input[1]);
        int c10 = Integer.parseInt(input[2]);
        int c50 = Integer.parseInt(input[3]);
        int c100 = Integer.parseInt(input[4]);
        int c500 = Integer.parseInt(input[5]);
        int sum = c1 + c5*5 + c10*10 + c50*50 + c100*100 + c500*500;
        System.out.println(sum >= 1000 ? 1 : 0);
    }
}
```
Note: The code uses the `Scanner` class to read input from the user, and the `split()` method to split the input string into an array of strings. The `parseInt()` method is used to convert each string to an integer. The `sum` variable is calculated using the values of the `c1`, `c5`, `c10`, `c50`, `c100`, and `c500` variables. Finally, the `println()` method is used to print the result.</s>
