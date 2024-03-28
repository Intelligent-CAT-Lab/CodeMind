<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2096

Expected output:
2108


```
import java.sql.Timestamp;
import java.util.*;

public class codeforces_678_B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int y = in.nextInt();
        boolean leap = check_leap(y);
        int sum = 0;
        int mod = 0;
        
        for (int i = y + 1;; i++) {
            if (check_leap(i)) {
                sum += 366;
            } else {
                sum += 365;
            }
            
            if (sum % 7 == 0) {
                if ((check_leap(i) && leap) || (!check_leap(i) && !leap)) {
                    System.out.println(i);
                    return;
                } else {
                    continue;
                }
            }
        }
    }
    
    static boolean check_leap(int y) {
        return y % 400 == 0 || (y % 4 == 0 && y % 100 != 0);
    }
}
```

@@ Response
```python
def check_leap(y):
    return y % 400 == 0 or (y % 4 == 0 and y % 100 != 0)

def main():
    y = int(input())
    leap = check_leap(y)
    sum = 0
    mod = 0

    for i in range(y + 1, 10**9):
        if check_leap(i):
            sum += 366
        else:
            sum += 365

        if sum % 7 == 0:
            if ((check_leap(i) and leap) or (not check_leap(i) and not leap)):
                print(i)
                return
            else:
                continue

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the user, checks if it's a leap year, and then iterates through the years starting from the next year. If the sum of the days in the years is a multiple of 7, it checks if the current year is a leap year and the input year is also a leap year, or if the current year is not a leap year and the input year is not a leap year. If the conditions are met, it prints the current year and stops.<｜end▁of▁sentence｜>
