Here is the Python equivalent of the Java code:

```python
def main():
    s = input()
    ans1 = 0
    ans2 = 0
    
    for i in range(len(s)):
        c = s[i]
        
        if i % 2 == 0:
            if c == '0':
                ans1 += 1
            else:
                ans2 += 1
        else:
            if c == '1':
                ans1 += 1
            else:
                ans2 += 1
                
    print(min(ans1, ans2))

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the user, counts the number of '0's and '1's at even and odd indices, and then prints the minimum of these two counts.
