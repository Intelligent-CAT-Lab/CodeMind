<s> Translate the following python code to java and enclose your solution inside ```java```:
```
i = list(map(int, input().split()))

if i[2] + i[4] <= i[0]:
    if i[2] - i[4] >= 0:
        if i[3] + i[4] <= i[1]:
            if i[3] - i[4] >= 0:
                print("Yes")
            else:
                print("No")
        else:
            print("No")
    else:
        print("No")
else:
    print("No")

```

### Input

The first line of input contains a single integer $n$ ($1 \leq n \leq 10^5$) denoting the number of test cases.

Each test case contains a single line containing $n$ space-separated integers $i_1, i_2, \ldots, i_n$ ($1 \leq i_1, i_2, \ldots, i_n \leq 10^9$).

### Output

For each test case, print "Yes" if the given condition is true, or "No" otherwise.

### Sample Input

```
3
1 2 3
4 5 6
7 8 9
```

### Sample Output

```
Yes
No
Yes
```

### Explanation

For the first test case, $i_2 + i_4 = 3 + 6 = 9 \leq 1$, and $i_2 - i_4 = 3 - 6 = -3 \geq 0$.

For the second test case, $i_2 + i_4 = 5 + 6 = 11 > 1$, and $i_2 - i_4 = 5 - 6 = -1 \leq 0$.

For the third test case, $i_2 + i_4 = 9 + 9 = 18 > 1$, and $i_2 - i_4 = 9 - 9 = 0 \geq 0$.

### Hint

You can use the `map` function to convert the input string to a list of integers.

You can use the `if` statement to check the condition.

You can use the `print` function to output the result.

### Solution

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int[] iArr = new int[5];
            for (int j = 0; j < 5; j++) {
                iArr[j] = sc.nextInt();
            }
            if (iArr[2] + iArr[4] <= iArr[0]) {
                if (iArr[2] - iArr[4] >= 0) {
                    if (iArr[3] + iArr[4] <= iArr[1]) {
                        if (iArr[3] - iArr[4] >= 0) {
                            System.out.println("Yes");
                        } else {
                            System.out.println("No");
                        }
                    } else {
                        System.out.println("No");
                    }
                } else {
                    System.out.println("No");
                }
            } else {
                System.out.println("No");
            }
        }
    }
}
```
</s>
