Here is the Python equivalent of the Java code:

```python
def main():
    s = input()
    a = len(s)
    
    flag = True
    
    if s[0] == s[a-1]:
        if a % 2 == 1:
            flag = False
        else:
            flag = True
    else:
        if a % 2 == 1:
            flag = True
        else:
            flag = False
            
    if flag:
        print("First")
    else:
        print("Second")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the user, checks if the first and last characters are the same, and then checks if the length of the string is odd or even. Based on these conditions, it prints "First" or "Second".
