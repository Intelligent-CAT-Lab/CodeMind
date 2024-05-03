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

This Python code does the same thing as the Java code: it reads a string of length 3 from the user, and for each character in the string, it replaces '1' with '9' and '9' with '1'. The modified string is then printed out.
