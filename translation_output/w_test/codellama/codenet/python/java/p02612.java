<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1900

Expected output:
100


```
n=int(input())
print(1000-n%1000 if n%1000!=0 else 0)
```
[/INST]
```java
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = 1000 - n % 1000;
        if (n % 1000 != 0) {
            System.out.println(result);
        } else {
            System.out.println(0);
        }
    }
}
```
Explanation:

* The `Scanner` class is used to read input from the user.
* The `nextInt()` method is used to read an integer from the user.
* The `int` keyword is used to declare a variable of type integer.
* The `%` operator is used to calculate the remainder of the division of `n` by 1000.
* The `if` statement is used to check if the remainder is not equal to 0, and if it is, then the result is printed.
* The `else` statement is used to print 0 if the remainder is equal to 0.
* The `System.out.println()` method is used to print the result to the console.</s>
