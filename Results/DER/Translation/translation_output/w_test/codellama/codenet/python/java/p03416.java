<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
11009 11332

Expected output:
4


```
f, t = [int(i) for i in input().split()]
print(len([i for i in range(f, t+1) if str(i) == str(i)[::-1]]))
```
[/INST]
```java
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int f = scanner.nextInt();
        int t = scanner.nextInt();
        int count = 0;
        for (int i = f; i <= t; i++) {
            if (isPalindrome(i)) {
                count++;
            }
        }
        System.out.println(count);
    }

    private static boolean isPalindrome(int num) {
        String str = String.valueOf(num);
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
```
This code uses a for loop to iterate through the range of numbers from `f` to `t`, and checks if each number is a palindrome using the `isPalindrome` method. The `isPalindrome` method converts the number to a string, reverses it, and then checks if the original string is equal to the reversed string. If they are equal, the number is a palindrome.

The `main` method first prompts the user to enter two numbers, `f` and `t`, and then uses a for loop to iterate through the range of numbers from `f` to `t`. For each number, it checks if it is a palindrome using the `isPalindrome` method. If it is a palindrome, it increments a counter variable. Finally, it prints the value of the counter variable, which is the number of palindromes in the range.

Note that this code assumes that the input numbers are positive integers. If the input numbers can be negative, the code will need to be modified to handle that case.</s>
