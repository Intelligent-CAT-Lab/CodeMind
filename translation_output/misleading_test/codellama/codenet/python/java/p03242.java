<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
119

Expected output:
999

```
moji = str(input())
ans = ""
for i in range(len(moji)):
    ans += ("1","9")[moji[i]=="1"]
print(ans)
```
[/INST]
```java
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '1') {
                output += "9";
            } else {
                output += "1";
            }
        }
        System.out.println(output);
    }
}
```
This code uses a `Scanner` to read input from the user, and then loops through each character in the input string using a `for` loop. For each character, it checks if it is equal to `'1'`, and if so, it appends the string `"9"` to the output, otherwise it appends the string `"1"` to the output. Finally, it prints the output to the console.

Note that this code assumes that the input string only contains the characters `'1'` and `'9'`, and that the input string is not empty. If the input string is empty, the code will throw a `NullPointerException`. If the input string contains any other characters, the code will not produce the expected output.</s>
