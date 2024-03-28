<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
uncopyrightable

Expected output:
yes


```
s=input()
count=0
for member in s:
    count=0
    for member2 in s:
        if member2==member:
            count+=1
    if count>=2:
        print("no")
        break
if count==1:
    print("yes")

```
[/INST]
```java
import java.util.Scanner;

public class Uncopyrightable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == c) {
                    count++;
                }
            }
            if (count >= 2) {
                System.out.println("no");
                break;
            }
        }
        if (count == 1) {
            System.out.println("yes");
        }
    }
}
```
This code uses a nested for loop to iterate over each character in the input string, and then checks if the character appears at least twice in the string. If it does, it prints "no" and breaks out of the loop. If it doesn't, it prints "yes" at the end.

Note that this code assumes that the input string is not empty. If the input string is empty, the code will print "yes" instead of "no". If you want to handle empty input strings, you can add a check for that before the nested for loop.</s>
