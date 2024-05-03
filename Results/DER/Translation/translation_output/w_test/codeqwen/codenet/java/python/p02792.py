Here is the Python equivalent of the Java code:

```python
def main():
    n = int(input())
    
    # Create a 2D array to store the frequency of each digit pair
    array = [[0]*10 for _ in range(10)]
    
    # Iterate over all numbers from 1 to n
    for i in range(1, n+1):
        head = int(str(i)[0])
        tail = i % 10
        array[head][tail] += 1
    
    # Calculate the result
    keta = len(str(n))
    result = 0
    for i in range(1, n+1):
        head = int(str(i)[0])
        tail = i % 10
        if tail == 0:
            continue
        result += array[tail][head]
    
    # Print the result
    print(result)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer `n` from the user, creates a 2D array to store the frequency of each digit pair, iterates over all numbers from 1 to `n`, and calculates the result. Finally, it prints the result.
