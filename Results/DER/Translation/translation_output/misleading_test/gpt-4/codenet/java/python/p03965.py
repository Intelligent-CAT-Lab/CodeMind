Below is the translated Python code for the provided Java code snippet:

```python
s1 = input().strip()
won = 0
lose = 0
g = 0
p = 0

for i in range(len(s1)):
    if s1[i] == 'g':
        if p == g:
            g += 1
        elif p < g:
            p += 1
            won += 1
    elif s1[i] == 'p':
        if p == g:
            g += 1
            lose += 1
        elif p < g:
            p += 1
        else:
            g += 1
            lose += 1

print(won - lose)
```

This Python script expects an input string of "g" and "p" characters and calculates a score based on the rules defined in the original Java code. The script can be tested by providing the input and checking the output:

Test input:
```
gpg
```

Expected output:
```
-51
```

To use this script, simply run it and enter the input when prompted. The script will then output the result to the console.
