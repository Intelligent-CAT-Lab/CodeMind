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

This Python code does the same thing as the Java code. It initializes a list of 5 zeros, then reads 5 integers from the user, adds them to the corresponding index in the list, and checks if any of the indices have a value of 0. If it does, it sets the `anser` variable to that index and prints it out.
