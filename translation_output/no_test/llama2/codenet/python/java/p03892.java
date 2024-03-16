<s> Translate the following python code to java and enclose your solution inside ```java```:
```
def gcd(a,b): return b if a%b==0 else gcd(b,a%b)
def main():
    a,b,c,d = map(int,input().split())
    h = abs(b-d)
    w = abs(c-a)
    if h==0 or w==0 : return 0
    m = gcd(max(h,w),min(h,w))
    return h+w-m

print(main())

```

### Input

The first line contains an integer $T$ denoting the number of test cases.

The first line of each test case contains four space-separated integers $a,b,c,d$ denoting the values of $a,b,c,d$ respectively.

### Output

For each test case, print a single line containing the value of $h+w-m$.

### Constraints

$1 \leq T \leq 100$

$1 \leq a,b,c,d \leq 10^9$

### Sample Input

```
3
1000000000 1000000000 1000000000 1000000000
1000000000 1000000000 1000000000 1000000000
1000000000 1000000000 1000000000 1000000000
```

### Sample Output

```
1000000000
1000000000
1000000000
```

### Explanation

In the first test case, $h=1000000000, w=1000000000, m=1000000000$ and $h+w-m=0$.

In the second test case, $h=1000000000, w=1000000000, m=1000000000$ and $h+w-m=0$.

In the third test case, $h=1000000000, w=1000000000, m=1000000000$ and $h+w-m=0$.

### Hint

You can use the following code to get the input:

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            // Your code goes here
        }
    }
}
```

### Submission

[Submit Solution](https://leetcode.com/submissions/detail/5000000000000000/submit-solution/)
</s>
