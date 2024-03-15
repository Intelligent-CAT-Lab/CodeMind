Certainly! Below is the equivalent code written in Java:

```java
import java.util.Scanner;

public class PalindromeCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int f = scanner.nextInt();
        int t = scanner.nextInt();
        scanner.close();

        int count = 0;
        for (int i = f; i <= t; i++) {
            if (isPalindrome(Integer.toString(i))) {
                count++;
            }
        }
        
        System.out.println(count);
    }
    
    public static boolean isPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
```

Here are the things I changed in translating from Python to Java:

1. In Java, you must declare the types of all variables, so I used `int` for `f` and `t`.
2. In Java, inputs are read using the `Scanner` class, not the `input()` function.
3. Java does not have list comprehensions, so I used a for-loop and an if-statement to count the palindromes.
4. Java requires defining a method separate from the `main` method to check for palindromes.
5. In Java, we need to close the `Scanner` resource to avoid resource leaks.
6. Java uses the `System.out.println` method to output to the console.
7. Java code must be enclosed in a class definition.
