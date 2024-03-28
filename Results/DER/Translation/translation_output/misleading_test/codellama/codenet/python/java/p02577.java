<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
123456789

Expected output:
Yes

```
n = input()
tmp = 0
for i in range(len(n)):
  tmp = (tmp + int(n[i])) % 9

print("Yes") if tmp == 0 else print("No")
```
[/INST]
```java
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int tmp = 0;
        for (int i = 0; i < input.length(); i++) {
            tmp = (tmp + Integer.parseInt(input.substring(i, i + 1))) % 9;
        }
        if (tmp == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `Integer.parseInt()` method to convert the input string to an integer. The `for` loop iterates over the length of the input string, and the `substring()` method is used to extract each digit from the input string. The `tmp` variable is used to store the sum of the digits, and the `% 9` operation is used to ensure that the sum is less than 9. Finally, the `if` statement is used to print "Yes" if the sum is 0, and "No" otherwise.</s>
