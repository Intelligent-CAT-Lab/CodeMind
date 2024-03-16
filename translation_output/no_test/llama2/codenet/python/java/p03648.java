<s> Translate the following python code to java and enclose your solution inside ```java```:
```
K=int(input())
print(50)
a,b=K//50,K%50
ans=[]
for i in range(50-b):
  ans.append(str(a+i))
  
for i in range(b):
  ans.append(str(a+50-b+i+1))
  
print(" ".join(ans))
```

### Input

The first line of input contains a single integer T, the number of test cases.

The first line of each test case contains a single integer K, the number of elements in the array.

### Output

For each test case, print the output in a single line.

### Constraints

1 <= T <= 100

1 <= K <= 100000

### Example Input

```
2
100
```

### Example Output

```
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44 45 46 47 48 49 50
```

### Explanation

The first line of input contains a single integer T, the number of test cases.

The first line of each test case contains a single integer K, the number of elements in the array.

### Hint

Use the modulus operator to find the remainder of the division.

### Submitting In Solution

If you have any issue in submitting your solution to this challenge, please check out the [solutions/readme](../../solutions/readme.md).
</s>
