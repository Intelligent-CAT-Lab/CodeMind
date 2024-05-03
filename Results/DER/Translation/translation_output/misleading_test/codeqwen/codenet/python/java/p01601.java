Here is the Java version of your Python code:

```java
public class Main {
    public static void main(String[] args) {
        String n = "13";
        for (int i = 0; i < 100000; i++) {
            if (Long.parseLong(n) >= i && isPalindrome(Long.parseLong(n) - i)) {
                System.out.println(Long.parseLong(n) - i);
                break;
            }
            if (isPalindrome(Long.parseLong(n) + i)) {
                System.out.println(Long.parseLong(n) + i);
                break;
            }
        }
    }

    public static boolean isPalindrome(long n) {
        long reversed = 0, original = n;
        while (n != 0) {
            long digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return original == reversed;
    }
}
```

This Java code does the same thing as your Python code. It checks for the closest palindrome number to the input number and prints it. The `isPalindrome` function checks if a number is a palindrome by reversing it and comparing it to the original number.
