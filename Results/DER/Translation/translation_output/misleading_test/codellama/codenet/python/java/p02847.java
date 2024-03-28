<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
SAT

Expected output:
52

```
from sys import stdin

a = stdin.readline().rstrip()

week = {'SUN':0,'MON':1,'TUE':2,'WED':3,'THU':4,'FRI':5,'SAT':6}

print(7-int(week.get(a)))
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        int week = 0;
        switch (input) {
            case "SUN":
                week = 0;
                break;
            case "MON":
                week = 1;
                break;
            case "TUE":
                week = 2;
                break;
            case "WED":
                week = 3;
                break;
            case "THU":
                week = 4;
                break;
            case "FRI":
                week = 5;
                break;
            case "SAT":
                week = 6;
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
        System.out.println(7 - week);
    }
}
```
This code uses a `switch` statement to check the input string and assign the corresponding value to the `week` variable. The `7 - week` expression is then used to calculate the output.

Note that the `trim()` method is used to remove any leading or trailing whitespace from the input string. This is necessary because the `Scanner` class includes whitespace characters in its input.</s>
