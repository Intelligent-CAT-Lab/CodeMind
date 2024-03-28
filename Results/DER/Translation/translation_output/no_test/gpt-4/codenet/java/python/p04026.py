Here is the equivalent code in Python:

```python
def main():
    s = input()
    last = [-1] * 26
    for i in range(len(s)):
        ch = ord(s[i]) - ord('a')
        if last[ch] >= 0 and i - last[ch] < 3:
            print(f"{last[ch] + 1} {i + 1}")
            return
        last[ch] = i
    print("-1 -1")

if __name__=='__main__':
    main()
```

This Python code defines a `main` function that performs the same task as the original Java code. It reads a string from standard input, then loops through each character, calculating the index of each letter in the alphabet. If a repeated character is found less than 3 indices apart from its previous occurrence, the positions are printed and the function returns. If no such condition is met, it prints "-1 -1" at the end just like the Java code.
