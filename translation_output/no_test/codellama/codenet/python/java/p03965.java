<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

s=input()
print(len(s)//2-s.count('p'))

Translate the above python code to java.

java code:

[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p') {
                count++;
            }
        }
        System.out.println(s.length() / 2 - count);
    }
}
```
This code uses the `Scanner` class to read a line of input from the user, and then uses a `for` loop to iterate over the characters in the string and count the number of occurrences of the letter 'p'. Finally, it prints the result, which is the length of the string divided by 2 minus the number of occurrences of 'p'.</s>
