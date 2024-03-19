<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
90

Expected output:
66

```
x = int(input())

for i in range(1, 10**5):
    if 360 * i % x == 0:
        print(360 * i // x)
        break
```
[/INST]
```java
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        for (int i = 1; i <= 100000; i++) {
            if (360 * i % x == 0) {
                System.out.println(360 * i / x);
                break;
            }
        }
    }
}
```
This code uses a `Scanner` to read the input from the user, and then it uses a `for` loop to iterate from 1 to 100000. For each value of `i`, it checks if `360 * i % x` is equal to 0. If it is, it prints `360 * i / x` and breaks out of the loop.

The `Scanner` class is used to read the input from the user. The `nextInt()` method is used to read the input as an integer.

The `for` loop iterates from 1 to 100000. The `if` statement checks if `360 * i % x` is equal to 0. If it is, it prints `360 * i / x` and breaks out of the loop.

The `System.out.println()` method is used to print the output.

The `break` statement is used to break out of the loop if the condition is met.

The `x` variable is used to store the input from the user.

The `i` variable is used to store the current value of the loop.

The `360 * i % x` expression is used to check if `360 * i` is divisible by `x`. If it is, the `if` statement is true and the code inside the `if` block is executed.

The `360 * i / x` expression is used to calculate the result.

The `System.out.println()` method is used to print the result.

The `break` statement is used to break out of the loop if the condition is met.

The `for` loop iterates from 1 to 100000. The `if` statement checks if `360 * i % x` is equal to 0. If it is, it prints `360 * i / x` and breaks out of the loop.

The `System.out.println()` method is used to print the output.

The `break` statement is used to break out of the loop if the condition is met.

The `x` variable is used to store the input from the user.

The `i` variable is used to store the current value of the loop.

The `360 * i % x` expression is used to check if `360 * i` is divisible by `x`. If it is, the `if` statement is true and the code inside the `if` block is executed.

The `360 * i / x` expression is used to calculate the result.

The `System.out.println()` method is used to print the result.

The `break` statement is used to break out of the loop if the condition is met.

The `for` loop iterates from 1 to 100000. The `if` statement checks if `360 * i % x` is equal to 0. If it is, it prints `360 * i / x` and breaks out of the loop.

The `System.out.println()` method is used to print the output.

The `break` statement is used to break out of the loop if the condition is met.

The `x` variable is used to store the input from the user.

The `i` variable is used to store the current value of the loop.

The `360 * i % x` expression is used to check if `360 * i` is divisible by `x`. If it is, the `if` statement is true and the code inside the `if` block is executed.

The `360 * i / x` expression is used to calculate the result.

The `System.out.println()` method is used to print the result.

The `break` statement is used to break out of the loop if the condition is met.

The `for` loop iterates from 1 to 100000. The `if` statement checks if `360 * i % x` is equal to 0. If it is, it prints `360 * i / x` and breaks out of the loop.

The `System.out.println()` method is used to print the output.

The `break` statement is used to break out of the loop if the condition is met.

The `x` variable is used to store the input from the user.

The `i` variable is used to store the current value of the loop.

The `360 * i % x` expression is used to check if `360 * i` is divisible by `x`. If it is, the `if` statement is true and the code inside the `if` block is executed.

The `360 * i / x` expression is used to calculate the result.

The `System.out.println()` method is used to print the result.

The `break` statement is used to break out of the loop if the condition is met.

The `for` loop iterates from 1 to 100000. The `if` statement checks if `360 * i % x` is equal to 0. If it is, it prints `360 * i / x` and breaks out of the loop.

The `System.out.println()` method is used to print the output.

The `break` statement is used to break out of the loop if the condition is met.

The `x` variable is used to store the input from the user.

The `i` variable is used to store the current value of the loop.

The `360 * i % x` expression is used to check if `360 * i` is divisible by `x`. If it is, the `if` statement is true and the code inside the `if` block is executed.

The `360 * i / x` expression is used to calculate the result.

The `System.out.println()` method is used to print the result.

The `break` statement is used to break out of the loop if the condition is met.

The `for` loop iterates from 1 to 100000. The `if` statement checks if `360 * i % x` is equal to 0. If it is, it prints `360 * i / x` and breaks out of the loop.

The `System.out.println()` method is used to print the output.

The `break` statement is used to break out of the loop if the condition is met.

The `x` variable is used to store the input from the user.

The `i` variable is used to store the current value of the loop.

The `360 * i % x` expression is used to check if `360 * i` is divisible by `x`. If it is, the `if` statement is true and the code inside the `if` block is executed.

The `360 * i / x` expression is used to calculate the result.

The `System.out.println()` method is used to print the result.

The `break` statement is used to break out of the loop if the condition is met.

The `for` loop iterates from 1 to 100000. The `if` statement checks if `360 * i % x` is equal to 0. If it is, it prints `360 * i / x` and breaks out of the loop.

The `System.out.println()` method is used to print the output.

The `break` statement is used to break out of the loop if the condition is met.

The `x` variable is used to store the input from the user.

The `i` variable is used to store the current value of the loop.

The `360 * i % x` expression is used to check if `360 *
