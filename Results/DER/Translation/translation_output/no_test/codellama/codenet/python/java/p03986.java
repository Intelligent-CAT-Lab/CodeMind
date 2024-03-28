<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

X=input()
ans=0
memo=0
for i in range(len(X)):
    if X[i]=="T":
        if memo==0:pass
        else:memo-=1
    else:memo+=1
print(memo*2)

Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String X = scanner.nextLine();
        int ans = 0;
        int memo = 0;
        for (int i = 0; i < X.length(); i++) {
            if (X.charAt(i) == 'T') {
                if (memo == 0) {
                    // do nothing
                } else {
                    memo--;
                }
            } else {
                memo++;
            }
        }
        System.out.println(memo * 2);
    }
}
```
Note that in Java, we use the `Scanner` class to read input from the user, and the `charAt()` method to access the characters in a string. We also use the `length()` method to get the length of a string.</s>
