Here is the equivalent Python code for the provided Java code:

```python
def main():
    X = input()
    output = ""
    for i in range(len(X)):
        if i == 4:
            output += " " + X[i]
        else:
            output += X[i]
    
    print(output)

if __name__ == "__main__":
    main()
```

This code reads a string from input, then loops through the characters of the string and inserts a space before the character at index 4, then prints the modified string.
