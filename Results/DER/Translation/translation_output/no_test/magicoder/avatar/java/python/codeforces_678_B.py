<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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

This Python code does the same thing as the Java code. It checks if the next year is a leap year and adds the number of days in that year to a running total. If the total number of days is a multiple of 7, it checks if the year is a leap year and the current year is a leap year. If both conditions are met, it prints the year and stops. If not, it continues to the next year.<｜end▁of▁sentence｜>
