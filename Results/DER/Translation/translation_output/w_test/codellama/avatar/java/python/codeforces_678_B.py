<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
This is a Python implementation of the Java code provided. The `check_leap` function is the same as the Java code, and it returns `True` if the year is a leap year and `False` otherwise. The `main` function takes the input year from the user, checks if it is a leap year, and then calculates the sum of the number of days in the years from the input year to 1000000000 (a large number that is not a leap year). If the sum of the days is divisible by 7, it checks if the current year is a leap year and the previous year was also a leap year, and if so, it prints the current year and breaks out of the loop. Otherwise, it continues the loop.</s>
