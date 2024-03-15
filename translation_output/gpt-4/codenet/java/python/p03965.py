Below is the translated code from Java to Python:

```python
# Input logic in Python
s1 = input()

# Initialization of variables
won = 0
lose = 0
g = 0
p = 0

# Loop over the characters in the string
for char in s1:
    if char == 'g':
        if p == g:
            g += 1
        elif p < g:
            p += 1
            won += 1
    elif char == 'p':
        if p == g:
            g += 1
            lose += 1
        elif p < g:
            p += 1
        else:
            g += 1
            lose += 1

# Output the result
print(won - lose)
```

This code will take a string as input and count the wins and losses based on the 'g' and 'p' characters in the string, and finally prints out the difference between won and lost (won minus lose).
