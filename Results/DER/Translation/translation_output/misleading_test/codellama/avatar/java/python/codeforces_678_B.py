<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2096

Expected output:
2141

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
[/INST]
```python
import datetime

def check_leap(year):
    if year % 400 == 0 or (year % 4 == 0 and year % 100 != 0):
        return True
    else:
        return False

def main():
    year = int(input())
    leap = check_leap(year)
    sum = 0
    mod = 0

    for i in range(year + 1, 1000000000):
        if check_leap(i):
            sum += 366
        else:
            sum += 365

        if sum % 7 == 0:
            if (check_leap(i) and leap) or (not check_leap(i) and not leap):
                print(i)
                break
            else:
                continue

if __name__ == "__main__":
    main()
```
This code is a solution to the Codeforces problem 678 B. It takes a year as input and outputs the next year that is a multiple of 7 and has the same leap year status as the input year.

The code first checks if the input year is a leap year using the `check_leap` function. It then initializes the `sum` variable to 0 and the `mod` variable to 0.

The code then enters a loop that iterates from the input year + 1 to 1000000000. For each year in the loop, it checks if the year is a leap year using the `check_leap` function. If the year is a leap year, it adds 366 to the `sum` variable, otherwise it adds 365.

After adding the number of days to the `sum` variable, the code checks if the `sum` variable is a multiple of 7. If it is, it checks if the current year has the same leap year status as the input year. If it does, it prints the current year and breaks out of the loop. Otherwise, it continues the loop.

The code then prints the next year that is a multiple of 7 and has the same leap year status as the input year.</s>
