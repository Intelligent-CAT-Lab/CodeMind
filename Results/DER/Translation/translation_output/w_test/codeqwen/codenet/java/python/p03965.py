Here is the Python equivalent of the Java code:

```python
def main():
    s1 = input()
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

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the user, then iterates over each character in the string. If the character is 'g', it increments the `g` counter and checks if `p` is equal to `g`. If they are equal, it increments `g` again. If `p` is less than `g`, it increments `p` and `won` by 1. If the character is 'p', it does the same thing as for 'g', but it also checks if `p` is less than `g` before incrementing `p`. If `p` is equal to `g`, it increments `g` and `lose` by 1. Finally, it prints the difference between `won` and `lose`.
