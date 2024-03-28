<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

s=input()
dic={'a':0,'b':0,'c':0}
for c in s:
    dic[c]+=1
a,b,c=dic.values()
print('YES' if max(abs(a-b),abs(b-c),abs(c-a))<=1 else 'NO')

Translate the above python code to java.

java code:

[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int[] counts = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            counts[c - 'a']++;
        }
        int a = counts[0];
        int b = counts[1];
        int c = counts[2];
        if (Math.abs(a - b) <= 1 && Math.abs(b - c) <= 1 && Math.abs(c - a) <= 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```
This code uses a `Scanner` to read a line of input from the user, and then it uses a `for` loop to iterate over the characters in the input string. For each character, it increments the corresponding index in the `counts` array. Finally, it checks if the absolute difference between the counts of the three characters is less than or equal to 1, and if so, it prints "YES", otherwise it prints "NO".</s>
