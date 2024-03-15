<s> Translate the following python code to java and enclose your solution inside ```java```:
```
n = int(input())
A = list()
for i in range(1,n+1):
    if i % 3 == 0:
        A.append(i)
    elif "3" in str(i):
        A.append(i)
print(" ", end="")
for i in range(len(A)-1):
    print(A[i], end=" ")
print(A[len(A)-1])


```

### Input

The first line of input contains a single integer `n` denoting the number of test cases.

The next `n` lines of input contain a single integer `i` each.

### Output

For each test case, print a single line containing the elements of `A` separated by a single space.

### Constraints

1 <= `n` <= 100

1 <= `i` <= 1000

### Example Input

```
3
1
3
3
```

### Example Output

```
1 3
3 3
```

### Explanation

The first test case has `n = 3` and `A = [1, 3]`.

The second test case has `n = 3` and `A = [3, 3]`.

The third test case has `n = 3` and `A = [1, 3]`.

### Hint

You can use the `String` class to check if a string is a substring of another string.

### Solution

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> A = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            int num = sc.nextInt();
            if (num % 3 == 0) {
                A.add(num);
            } else if (num % 3 == 1 && num % 5 == 0) {
                A.add(num);
            } else if (num % 3 == 2 && num % 5 == 0) {
                A.add(num);
            } else if (num % 3 == 0 && num % 5 == 0) {
                A.add(num);
            }
        }
        for (int i = 0; i < A.size() - 1; i++) {
            System.out.print(A.get(i) + " ");
        }
        System.out.print(A.get(A.size() - 1));
    }
}
```
</s>
