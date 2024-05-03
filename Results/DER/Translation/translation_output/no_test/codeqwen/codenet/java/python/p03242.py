Here is the Python equivalent of the Java code:

```python
def main():
    S = list(input())
    for i in range(3):
        S[i] = '9' if S[i] == '1' else '1'
    print(''.join(S))

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the user, converts it to a list of characters, then iterates over the first three characters. If the character is '1', it replaces it with '9', otherwise it replaces it with '1'. Finally, it joins the list back into a string and prints it.
