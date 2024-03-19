<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
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

python code:<fim_suffix><fim_middle>

```python
import java.sql.Timestamp;
import java.util.*;

def check_leap(y):
    return y % 400 == 0 or (y % 4 == 0 and y % 100!= 0)

def main():
    in = input()
    y = int(in)
    leap = check_leap(y)
    sum = 0
    mod = 0

    for i in range(y + 1,):
        if check_leap(i):
            sum += 366
        else:
            sum += 365

        if sum % 7 == 0:
            if ((check_leap(i) and leap) or (!check_leap(i) and!leap)):
                print(i)
                return
            else:
                continue

if __name__ == '__main__':
    main()
```

'''
<|endoftext|>
