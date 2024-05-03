Here is the Python equivalent of the Java code:

```python
def main():
    top = input()
    cpp = False
    score = 0
    for j in range(len(top)):
        if cpp:
            if top[j] == 'g':
                score += 1
            cpp = False
        else:
            if top[j] == 'p':
                score -= 1
            cpp = True
    print(score)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the user, then iterates over each character in the string. If the current character is 'p', it decreases the score by 1. If the current character is 'g', it increases the score by 1. The variable `cpp` is used to keep track of whether the current character is 'p' or 'g'. After each character, it toggles the value of `cpp`. Finally, it prints the score.
