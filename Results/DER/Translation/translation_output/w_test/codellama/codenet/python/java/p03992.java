<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
CODEFESTIVAL

Expected output:
CODE FESTIVAL


```
s = input()
print(s[:4] + ' ' + s[4:])
```
[/INST]
```java
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(s.substring(0, 4) + " " + s.substring(4));
    }
}
```
Explanation:

* `Scanner scanner = new Scanner(System.in);` creates a new `Scanner` object that reads input from the standard input stream.
* `String s = scanner.nextLine();` reads a line of input from the user and stores it in the `s` variable.
* `System.out.println(s.substring(0, 4) + " " + s.substring(4));` prints the first 4 characters of `s` followed by a space and then the remaining characters of `s`.

Note: The `substring()` method is used to extract a substring from a string. The first argument is the starting index of the substring, and the second argument is the ending index of the substring. In this case, we are extracting the first 4 characters of `s` and then the remaining characters of `s`.</s>
