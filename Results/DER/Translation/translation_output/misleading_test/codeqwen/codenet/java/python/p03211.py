Here is the Python equivalent of the Java code:

```python
def main():
    S = input()
    min_val = 1000
    for i in range(len(S) - 2):
        X = int(S[i:i+3])
        min_val = min(min_val, abs(X - 753))
    print(min_val)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the user, then iterates over all possible substrings of length 3. For each substring, it converts it to an integer and calculates the absolute difference between it and 753. It keeps track of the smallest difference it finds and prints it out at the end.
