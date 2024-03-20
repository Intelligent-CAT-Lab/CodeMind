Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
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
                if ((check_leap(i) && leap) || (!check_leap(i) &&!leap)) {
                    System.out.println(i);
                    return;
                } else {
                    continue;
                }
            }
        }
    }
    
    static boolean check_leap(int y) {
        return y % 400 == 0 || (y % 4 == 0 && y % 100!= 0);
    }
}
```

### Response:
```python
import java.sql.Timestamp
import java.util.*

def check_leap(y):
    return y % 400 == 0 or (y % 4 == 0 and y % 100!= 0)

def main():
    in = Scanner(System.in)
    y = in.nextInt()
    leap = check_leap(y)
    sum = 0
    mod = 0
    
    for i in range(y+1, sys.maxsize):
        if check_leap(i):
            sum += 366
        else:
            sum += 365
        
        if sum % 7 == 0:
            if (check_leap(i) and leap) or (not check_leap(i) and not leap):
                print(i)
                return
            else:
                continue

if __name__ == '__main__':
    main()
```

Explanation:

- We have imported the necessary classes from java.sql.Timestamp and java.util.Scanner.
- We have defined a function `check_leap` which takes an integer `y` and returns True if it is a leap year, else False.
- We have defined a function `main` which takes input from the user using Scanner and checks if the year is a leap year or not.
- We have initialized the variables `sum` and `mod` to 0.
- We have used a for loop to iterate over all the years starting from the input year and going up to the maximum integer value.
- Inside the loop, we have checked if the current year is a leap year or not and added the number of days accordingly.
- We have checked if the sum of days is divisible by 7 or not.
- If the sum is divisible by 7, we have checked if the current year is a leap year or not and the input year is a leap year or not. If they are both leap years or both not leap years, we have printed the current year and returned from the function. If they are not equal, we have continued the loop.
- Finally, we have called the `main` function to run the program.<|endoftext|>
