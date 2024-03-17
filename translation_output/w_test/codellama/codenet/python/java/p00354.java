<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1

Expected output:
fri


```

X=int(input())
Day=["mon","tue","wed","thu","fri","sat","sun"]
a=X%7
if a==2 or a==3:
  print(Day[a+3])
elif a==4 or a==5 or a==6:
  print(Day[a-4])
elif a==0 or a==1:
  print(Day[a+3])
  


```
[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        String[] Day = {"mon", "tue", "wed", "thu", "fri", "sat", "sun"};
        int a = X % 7;
        if (a == 2 || a == 3) {
            System.out.println(Day[a + 3]);
        } else if (a == 4 || a == 5 || a == 6) {
            System.out.println(Day[a - 4]);
        } else if (a == 0 || a == 1) {
            System.out.println(Day[a + 3]);
        }
    }
}
```
Note: The above code uses the `Scanner` class to read input from the user, and the `String[]` array to store the days of the week. The `%` operator is used to calculate the remainder of the division of `X` by 7, which is used to determine the day of the week. The `if` statement is used to print the correct day of the week based on the remainder.</s>
