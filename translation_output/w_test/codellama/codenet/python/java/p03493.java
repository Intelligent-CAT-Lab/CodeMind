<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
101

Expected output:
2


```
print(input().count('1'))
```
[/INST]
```java
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int count = input.length() - input.replace("1", "").length();
        System.out.println(count);
    }
}
```
This code uses the `Scanner` class to read a line of input from the user, and then uses the `String.length()` method to get the length of the input string. It then uses the `String.replace()` method to replace all occurrences of the character "1" with an empty string, and then uses the `String.length()` method again to get the length of the resulting string. The difference between the two lengths is the number of occurrences of the character "1" in the input string.

Here's an example of how you could test this code:
```
public class SolutionTest {
    @Test
    public void test() {
        String input = "101";
        int expectedOutput = 2;
        int actualOutput = Solution.main(input);
        assertEquals(expectedOutput, actualOutput);
    }
}
```
This test case passes the string "101" to the `main()` method of the `Solution` class, and then checks that the output is equal to 2.</s>
