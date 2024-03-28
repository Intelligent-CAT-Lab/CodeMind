<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
xabxa

Expected output:
2


```
import sys
S = str(input())
i = 0
j = len(S) - 1
c = 0
while(True):
    if i >= j:
        break
    if (S[i] == S[j]):
        i += 1
        j -= 1
    else:
        if (S[i] == 'x'):
            i += 1
            c += 1
        elif (S[j] == 'x'):
            j -= 1
            c += 1
        else:
            print('-1')
            sys.exit()
print(c)
```
[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int i = 0;
        int j = S.length() - 1;
        int c = 0;
        while (true) {
            if (i >= j) {
                break;
            }
            if (S.charAt(i) == S.charAt(j)) {
                i++;
                j--;
            } else {
                if (S.charAt(i) == 'x') {
                    i++;
                    c++;
                } else if (S.charAt(j) == 'x') {
                    j--;
                    c++;
                } else {
                    System.out.println(-1);
                    System.exit(0);
                }
            }
        }
        System.out.println(c);
    }
}
```
This is the Java code for the given Python code. The code uses the `Scanner` class to read input from the user, and the `String` class to manipulate the input string. The `charAt()` method is used to access the characters of the string, and the `length()` method is used to get the length of the string. The `while` loop is used to iterate over the characters of the string, and the `if` statements are used to check if the characters are equal, or if one of them is 'x'. If the characters are not equal and one of them is not 'x', the program prints -1 and exits. Otherwise, it increments the counter and continues the loop. Finally, the program prints the counter and exits.</s>
