<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
11009 11332

Expected output:
-10

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
This code uses a for loop to iterate through the range of numbers from `f` to `t`, and for each number, it checks if it is a palindrome using the `isPalindrome` method. If the number is a palindrome, it increments the `count` variable. Finally, it prints the value of `count`.

The `isPalindrome` method takes an integer `num` as input and converts it to a string using `String.valueOf(num)`. It then creates a `StringBuilder` object from the string and reverses it using the `reverse()` method. Finally, it compares the original string with the reversed string using the `equals()` method, and returns `true` if they are equal, indicating that the number is a palindrome.</s>
