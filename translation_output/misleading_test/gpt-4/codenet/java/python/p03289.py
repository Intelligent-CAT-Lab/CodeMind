Here is the equivalent Python code for the provided Java code:

```python
S = input()
if S[0] != 'A':
    print("WA")
else:
    count = S[2:-1].count('C')
    if count == 1:
        index = S[2:-1].index('C') + 2
        if S[1:index].islower() and S[index + 1:].islower():
            print("AC")
        else:
            print("WA")
    else:
        print("WA")
```

Now let's test it with the provided test case:

Test input:
```
AtCoder
```
Expected output:
```
AC
```
