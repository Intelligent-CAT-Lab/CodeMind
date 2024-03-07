<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

n=float(input())
print(n//1+1 if n*2**0.5<n//1+1 else n*2**0.5)

Translate the above python code to java.

java code:

[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        double result = n / 1 + 1;
        if (n * Math.pow(2, 0.5) < result) {
            result = n * Math.pow(2, 0.5);
        }
        System.out.println(result);
    }
}
```
This code first prompts the user to enter a number, then it calculates the result using the formula provided in the Python code. The result is then printed to the console.

Note that the `Math.pow(2, 0.5)` method is used to calculate the square root of 2, which is used in the formula.</s>
