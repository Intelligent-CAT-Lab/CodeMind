<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

moji = str(input())
ans = ""
for i in range(len(moji)):
    ans += ("1","9")[moji[i]=="1"]
print(ans)

Translate the above python code to java.

java code:

[/INST]
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String moji = scanner.nextLine();
        String ans = "";
        for (int i = 0; i < moji.length(); i++) {
            if (moji.charAt(i) == '1') {
                ans += "1";
            } else {
                ans += "9";
            }
        }
        System.out.println(ans);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `String` class to manipulate the input string. The `for` loop iterates over the characters in the input string, and the `if` statement checks if each character is equal to `'1'`. If it is, the loop adds the character `'1'` to the output string. If it is not, the loop adds the character `'9'` to the output string. Finally, the `System.out.println()` method is used to print the output string.</s>
