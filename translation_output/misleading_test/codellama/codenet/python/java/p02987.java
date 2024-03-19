<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
ASSA

Expected output:
Yes

```
a,b,c,d = input()
flag = 0
if(a==b and c==d):
    flag = 1
elif(a==c and b==d):
    flag = 1
elif(a==d and b==c):
    flag = 1
else:
    flag = 0
if(a==b and a==c and a==d):
    flag = 0
if(flag==1):
    print("Yes")
else:
    print("No")
```
[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char a = input.charAt(0);
        char b = input.charAt(1);
        char c = input.charAt(2);
        char d = input.charAt(3);
        int flag = 0;
        if (a == b && c == d) {
            flag = 1;
        } else if (a == c && b == d) {
            flag = 1;
        } else if (a == d && b == c) {
            flag = 1;
        } else {
            flag = 0;
        }
        if (a == b && a == c && a == d) {
            flag = 0;
        }
        if (flag == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```
This code uses the `Scanner` class to read a line of input from the user, and then uses the `charAt()` method to extract the individual characters from the input string. It then checks if the characters are equal to each other in different ways, and sets the `flag` variable accordingly. Finally, it prints "Yes" or "No" based on the value of the `flag` variable.</s>
