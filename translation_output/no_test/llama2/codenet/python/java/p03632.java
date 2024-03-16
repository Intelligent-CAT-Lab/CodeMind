<s> Translate the following python code to java and enclose your solution inside ```java```:
```
A, B, C, D = map(int, input().split())
ans = min(B,D) - max(A,C)
 
if ans > 0:
    print(ans)
else:
    print(0)
```

### Input

The first line of input contains a single integer $T$ denoting the number of test cases. The description of $T$ test cases follows.

The first line of each test case contains a single integer $N$ denoting the number of elements in the array. The second line of each test case contains $N$ space-separated integers $A_1, A_2, \ldots, A_N$ denoting the elements of the array.

### Output

For each test case, print a single line containing a single integer denoting the minimum of $B$ and $D$ minus the maximum of $A$ and $C$.

### Constraints

$1 \leq T \leq 10^5$

$1 \leq N \leq 10^5$

$1 \leq A_i, B, C, D \leq 10^9$

### Sample Input

```
3
4
1 2 3 4
2 3
1 2
```

### Sample Output

```
1
1
0
```

### Explanation

```
Input:
1 2 3 4
2 3
1 2

Output:
1
1
0
```

### Hint

- Use the ```System.out.println()``` method to print to the console.
- Use the ```System.in.readLine()``` method to read input from the console.
- Use the ```System.out.flush()``` method to flush the console.
- Use the ```System.out.print()``` method to print to the console without a newline.
- Use the ```System.out.format()``` method to format output.
- Use the ```System.out.printf()``` method to format output.
- Use the ```System.out.println()``` method to print to the console and then flush the console.
- Use the ```System.out.println()``` method to print to the console and then flush the console and then print a newline.
- Use the ```System.out.println()``` method to print to the console and then flush the console and then print a newline and then print a space.
- Use the ```System.out.println()``` method to print to the console and then flush the console and then print a newline and then print a space and then print a tab.
- Use the ```System.out.println()``` method to print to the console and then flush the console and then print a newline and then print a space and then print a tab and then print a dollar sign.
- Use the ```System.out.println()``` method to print to the console and then flush the console and then print a newline and then print a space and then print a tab and then print a dollar sign and then print a backslash.
- Use the ```System.out.println()``` method to print to the console and then flush the console and then print a newline and then print a space and then print a tab and then print a dollar sign and then print a backslash and then print a plus sign.
- Use the ```System.out.println()``` method to print to the console and then flush the console and then print a newline and then print a space and then print a tab and then print a dollar sign and then print a backslash and then print a plus sign and then print a backslash.
- Use the ```System.out.println()``` method to print to the console and then flush the console and then print a newline and then print a space and then print a tab and then print a dollar sign and then print a backslash and then print a plus sign and then print a backslash and then print a minus sign.
- Use the ```System.out.println()``` method to print to the console and then flush the console and then print a newline and then print a space and then print a tab and then print a dollar sign and then print a backslash and then print a plus sign and then print a backslash and then print a minus sign and then print a backslash.
- Use the ```System.out.println()``` method to print to the console and then flush the console and then print a newline and then print a space and then print a tab and then print a dollar sign and then print a backslash and then print a plus sign and then print a backslash and then print a minus sign and then print a backslash and then print a dollar sign.
- Use the ```System.out.println()``` method to print to the console and then flush the console and then print a newline and then print a space and then print a tab and then print a dollar sign and then print a backslash and then print a plus sign and then print a backslash and then print a minus sign and then print a backslash and then print a dollar sign and then print a backslash.
- Use the ```System.out.println()``` method to print to the console and then flush the console and then print a newline and then print a space and then print a tab and then print a dollar sign and then print a backslash and then print a plus sign and then print a backslash and then print a minus sign and then print a backslash and then print a dollar sign and then print a backslash and then print a backslash.
- Use the ```System.out.println()``` method to print to the console and then flush the console and then print a newline and then print a space and then print a tab and then print a dollar sign and then print a backslash and then print a plus sign and then print a backslash and then print a minus sign and then print a backslash and then print a dollar sign and then print a backslash and then print a backslash and then print a backslash.
- Use the ```System.out.println()``` method to print to the console and then flush the console and then print a newline and then print a space and then print a tab and then print a dollar sign and then print a backslash and then print a plus sign and then print a backslash and then print a minus sign and then print a backslash and then print a dollar sign and then print a backslash and then print a backslash and then print a backslash and then print a backslash and then print a backslash.
- Use the ```System.out.println()``` method to print to the console and then flush the console and then print a newline and then print a space and then print a tab and then print a dollar sign and then print a backslash and then print a plus sign and then print a backslash and then print a minus sign and then print a backslash and then print a dollar sign and then print a backslash and then print a backslash and then print a backslash and then print a backslash and then print a backslash and then print a backslash and then print a backslash and then print a backslash.
- Use the ```System.out.println()``` method to print to the console and then flush the console and then print a newline and then print a space and then print a tab and then print a dollar sign and then print a backslash and then print a plus sign and then print a backslash and then print a minus sign and then print a backslash and then print a dollar sign and then print a backslash and then print a backslash and then print a backslash and then print a backslash and then print a backslash and then print a backslash and then print a backslash and then print a backslash and then print a backslash and then print a backslash and then print a backslash and then print a backslash and then print a backslash and then print a backslash and then print a backslash and then print a backslash and then print a backslash and then print a backslash and then print a backslash and then print a backslash and then print a backslash and then print a backslash and then print a backslash and then print a backslash and then print a backslash and then print a backslash and then print a backslash and then print a backslash and then print a backslash and then print a backslash and then print a backslash and then print a backslash and then print a backslash and then print a backslash and then print a backslash and then print a backslash and then print a backslash and then print a backslash and then print a backslash and then print a backslash and then print a backslash and then print a backslash and then print a backslash and then print a backslash and then print a backslash and then print a backslash and then print a backslash and then print a backslash and then print a backslash and then print a backslash and then print a backslash and then print a backslash and then print a backslash and then print a backslash and then print a backslash and then print a backslash and then print a backslash and then print a backslash and then print a backslash and then print a backslash and then print a backslash
