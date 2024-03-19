<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1900

Expected output:
102

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
        if (n % 1000 == 0) {
            result = 0;
        }
        System.out.println(result);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `%` operator to calculate the remainder of the division of `n` by 1000. If the remainder is not equal to 0, the result is set to 1000 minus the remainder. Otherwise, the result is set to 0. Finally, the result is printed to the console using `System.out.println()`.</s>
