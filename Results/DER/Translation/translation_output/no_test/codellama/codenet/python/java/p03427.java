<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

n = input()
print(max(int(n[0])-1+9*(len(n)-1),sum([int(i) for i in n])))

Translate the above python code to java.

java code:

[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        int maxValue = Math.max(Integer.parseInt(n.charAt(0)) - 1 + 9 * (n.length() - 1), sum(n));
        System.out.println(maxValue);
    }

    private static int sum(String n) {
        int sum = 0;
        for (int i = 0; i < n.length(); i++) {
            sum += Integer.parseInt(n.charAt(i));
        }
        return sum;
    }
}
```
This code uses the `Scanner` class to read a line of input from the user, and then uses the `Math.max()` method to find the maximum value between the first digit of the input minus 1 plus 9 times the length of the input minus 1, and the sum of the digits of the input. The `sum()` method is used to calculate the sum of the digits of the input. Finally, the maximum value is printed to the console.</s>
