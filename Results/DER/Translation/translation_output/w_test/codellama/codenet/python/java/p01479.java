<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
eggchickenegg

Expected output:
egg


```
s=input()
i=c=p=0;b=''
while i<len(s):
    if s[i]==b:
        if c > p:r=b;p=c
        c=0
    b=s[i]
    i+=[3,7][s[i]=='c']
    c+=1
if c>p:r=b
print(['chicken','egg'][r=='e'])
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int i = 0;
        int c = 0;
        int p = 0;
        char b = ' ';
        char r = ' ';
        while (i < input.length()) {
            if (input.charAt(i) == b) {
                if (c > p) {
                    r = b;
                    p = c;
                }
                c = 0;
            }
            b = input.charAt(i);
            i += (b == 'c') ? 3 : 7;
            c++;
        }
        if (c > p) {
            r = b;
        }
        System.out.println(r == 'e' ? "egg" : "chicken");
    }
}
```
This code uses a similar approach as the Python code, but it is written in Java. It uses a `Scanner` object to read the input from the user, and it uses a `String` object to store the input. It then uses a `while` loop to iterate over the characters in the input string, and it uses a `char` variable to keep track of the current character and a `int` variable to keep track of the current position in the input string.

The code also uses a `if` statement to check if the current character is equal to the previous character, and if it is, it increments the `c` variable. If the current character is not equal to the previous character, it sets the `b` variable to the current character and resets the `c` variable to 0.

Finally, the code uses a `if` statement to check if the `c` variable is greater than the `p` variable, and if it is, it sets the `r` variable to the current character. It then uses a `System.out.println` statement to print the result.</s>
