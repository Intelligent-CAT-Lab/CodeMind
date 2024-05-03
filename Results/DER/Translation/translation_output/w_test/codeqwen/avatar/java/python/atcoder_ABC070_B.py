Here is the Python equivalent of the Java code:

```python
def main():
    a, b, c, d = map(int, input().split())
    array = [0] * 101
    
    for i in range(a, b):
        array[i] += 1
    
    for i in range(c, d):
        array[i] += 1
    
    ans = 0
    for i in range(101):
        if array[i] == 2:
            ans += 1
    
    print(ans)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads four integers from the user, creates an array of size 101, and then increments the count of each index in the array based on the range provided by the user. After that, it counts the number of indices in the array that have a count of 2, which indicates that there are two overlapping ranges that include that index. Finally, it prints the count of such indices.
