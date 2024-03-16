<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

# é¨åæå­åã®ãã¡ãacgtã®ã¿ãããªããã®ã®æå¤§é·
# åé ­ããæ¢ç´¢ãã¦ãacgtãªãé·ãã+1ãã
ans = 0
length = 0
s = input()
for i in s:
  if i in ["A","C","G","T"]:
    length += 1
    ans = max(ans,length)
  else:
    length = 0
print(ans)

Translate the above python code to java.

java code:

[/INST]
```
import java.util.Scanner;

public class LongestACGTSequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int length = 0;
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'A' || c == 'C' || c == 'G' || c == 'T') {
                length++;
                ans = Math.max(ans, length);
            } else {
                length = 0;
            }
        }
        System.out.println(ans);
    }
}
```
This code uses a `Scanner` to read a line of input from the user, and then iterates over the characters in the string using a `for` loop. For each character, it checks if it is one of the four allowed characters (`A`, `C`, `G`, or `T`), and if so, it increments the `length` variable. If the character is not one of the allowed characters, it sets the `length` variable to 0. Finally, it prints the maximum value of `length` to the console.</s>
