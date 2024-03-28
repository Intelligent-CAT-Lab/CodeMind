<s> Translate the following python code to java and enclose your solution inside ```java```:
```
a=input()
e=a.count("+")
f=a.count("-")
print(e-f)
```

### Hint

- Use the `String` class to manipulate strings.
- Use the `String.count()` method to count the number of occurrences of a character in a string.
- Use the `String.length()` method to get the length of a string.
- Use the `String.charAt()` method to get a character at a specific index.
- Use the `String.indexOf()` method to get the index of the first occurrence of a character in a string.
- Use the `String.substring()` method to get a substring of a string.
- Use the `String.replace()` method to replace a substring in a string.
- Use the `String.equals()` method to compare two strings.
- Use the `String.concat()` method to concatenate two strings.
- Use the `String.split()` method to split a string into a list of strings.
- Use the `String.toUpperCase()` and `String.toLowerCase()` methods to convert a string to uppercase or lowercase.
- Use the `String.trim()` method to remove whitespace from the beginning and end of a string.
- Use the `String.replaceAll()` method to replace all occurrences of a substring in a string.
- Use the `String.charAt()` method to get a character at a specific index.
- Use the `String.indexOf()` method to get the index of the first occurrence of a character in a string.
- Use the `String.substring()` method to get a substring of a string.
- Use the `String.replace()` method to replace a substring in a string.
- Use the `String.equals()` method to compare two strings.
- Use the `String.concat()` method to concatenate two strings.
- Use the `String.split()` method to split a string into a list of strings.
- Use the `String.toUpperCase()` and `String.toLowerCase()` methods to convert a string to uppercase or lowercase.
- Use the `String.trim()` method to remove whitespace from the beginning and end of a string.
- Use the `String.replaceAll()` method to replace all occurrences of a substring in a string.

### Solution

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int e = a.count("+");
        int f = a.count("-");
        System.out.println(e - f);
    }
}
```
</s>
