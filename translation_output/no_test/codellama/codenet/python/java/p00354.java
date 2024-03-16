<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:


X=int(input())
Day=["mon","tue","wed","thu","fri","sat","sun"]
a=X%7
if a==2 or a==3:
  print(Day[a+3])
elif a==4 or a==5 or a==6:
  print(Day[a-4])
elif a==0 or a==1:
  print(Day[a+3])
  



Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```
import java.util.Scanner;

public class DayOfWeek {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int X = scanner.nextInt();
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
Note that the `Scanner` class is used to read input from the user, and the `System.out.print()` and `System.out.println()` methods are used to print output to the console. The `String[] Day` array is used to store the names of the days of the week, and the `a` variable is used to store the remainder of the input number divided by 7. The `if` statements are used to determine which day of the week the input number corresponds to, and the `System.out.println()` method is used to print the corresponding day of the week to the console.</s>
