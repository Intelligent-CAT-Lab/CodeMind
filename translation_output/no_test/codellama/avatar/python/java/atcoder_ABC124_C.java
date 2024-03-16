<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python Code:

s = input ( )
cnt1 = 0
cnt2 = 0
for i in range ( len ( s ) ) :
    if i % 2 == 0 :
        if s [ i ] == '0' :
            cnt1 += 1
        else :
            cnt2 += 1
    else :
        if s [ i ] == '0' :
            cnt2 += 1
        else :
            cnt1 += 1
print ( min ( cnt1 , cnt2 ) )



Translate the above python code to java.

java Code:

[/INST]

Here is the Java code that translates the Python code:
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int cnt1 = 0;
        int cnt2 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                if (s.charAt(i) == '0') {
                    cnt1++;
                } else {
                    cnt2++;
                }
            } else {
                if (s.charAt(i) == '0') {
                    cnt2++;
                } else {
                    cnt1++;
                }
            }
        }
        System.out.println(Math.min(cnt1, cnt2));
    }
}
```
Note that the Java code uses the `Scanner` class to read input from the user, and the `Math.min()` method to find the minimum of two numbers. The `charAt()` method is used to access the characters in the string.</s>
