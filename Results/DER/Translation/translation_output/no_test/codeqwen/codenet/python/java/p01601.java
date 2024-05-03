Here is the Java version of your Python code:

```java
public class Main {
    public static void main(String[] args) {
        String n = System.console().readLine();
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

This Java code does the same thing as your Python code. It reads a number from the console, then checks if the number or any of its successors or predecessors is a palindrome. If it finds a palindrome, it prints it and breaks the loop. If it doesn't find a palindrome after checking all numbers, it doesn't print anything.
