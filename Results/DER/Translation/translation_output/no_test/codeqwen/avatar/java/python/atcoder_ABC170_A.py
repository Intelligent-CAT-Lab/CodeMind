Here is the Python equivalent of the Java code:

```python
def main():
    count = [0] * 5
    
    for i in range(5):
        x = int(input())
        count[i] += x
        
        if count[i] == 0:
            anser = i
            
    print(anser + 1)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It initializes a list of 5 zeros, then iterates over the list, taking an integer input for each iteration and adding it to the corresponding index in the list. If the value at any index becomes zero, it sets the `anser` variable to that index. Finally, it prints the `anser` variable incremented by one.
