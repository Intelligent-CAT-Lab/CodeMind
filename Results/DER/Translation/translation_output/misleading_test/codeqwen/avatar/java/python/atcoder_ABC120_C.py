Here is the Python equivalent of the Java code:

```python
def main():
    s1 = input()
    ans = 0
    c1 = 0
    c0 = 0
    
    for i in range(len(s1)):
        if s1[i] == '1':
            if c0 > 0:
                c0 -= 1
                ans += 1
            else:
                c1 += 1
        else:
            if c1 > 0:
                c1 -= 1
                ans += 1
            else:
                c0 += 1
    
    print(ans * 2)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the user, counts the number of '1's and '0's in the string, and then calculates the minimum number of swaps needed to make the string alternating. The result is printed to the console.
