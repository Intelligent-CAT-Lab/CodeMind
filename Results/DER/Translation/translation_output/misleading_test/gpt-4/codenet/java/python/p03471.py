Below is the translated Python code:

```python
X, Y = map(int, input().split())

sum = 0
judge = False
a = 0
b = 0
c = 0

for i in range(X+1):
    for k in range(X-i+1):
        sum = 10000*i + 5000*k + 1000*(X-i-k)
        if sum == Y:
            judge = True
            a = i
            b = k
            c = X-i-k
            break
    if judge:
        break
        
if judge:
    print(a, b, c)
else:
    print("-1 -1 -1")
```

And the expected output for the provided test case:

Test input:
`9 45000`

Expected output:
`4 0 5` 

Note: There seems to be a small discrepancy in the expected output you provided ("4 0" instead of the complete "4 0 5"). Based on the logic in the Java code, the Python code will produce the output with all three values (a, b, c). If you only want the first two values (as in your expected output), that would indicate that the Java code has a different expected behavior or that there's an error in the expected output.
