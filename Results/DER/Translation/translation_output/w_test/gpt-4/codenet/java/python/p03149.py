Here is the translated Python code from the Java code you've provided:

```python
def main():
    # Reading input separated by spaces and converting to integers
    N = list(map(int, input().split()))
    # Sorting the list
    N.sort()
    # Checking if the sorted list matches the desired pattern
    ans = N == [1, 4, 7, 9]
    # Print result
    if ans:
        print("YES")
    else:
        print("NO")

# Call the main function to execute the test case
if __name__ == '__main__':
    main()
```

You would run this Python program and it would wait for your input. You would then type in `1 7 9 4` (the test case) and press Enter, and it should output `YES` as expected.
