<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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

### Response:
Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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

This Java code does the same thing as your Python code. It takes an integer input `X`, calculates `X` modulo 7 and stores the result in `a`. Then it checks the value of `a` and prints the corresponding day of the week from the `Day` array.
<|EOT|>
