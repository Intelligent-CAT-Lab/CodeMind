Below is the equivalent Python code for the provided Java code, using Python's native data types and functionality:

```python
# No equivalent import necessary in Python for the required functionality

def main():
    # Reading string input from user
    A = input()

    # Getting the length of the input string
    N = len(A)
    
    # Initializing the count array for each alphabet letter
    cnt = [0] * 26
    
    # Counting occurrences of each letter in the string
    for ch in A:
        cnt[ord(ch) - ord('a')] += 1
    
    # Calculating the answer based on string length
    ans = (N * (N + 1) // 2) + 1
    
    # Adjusting the answer based on the frequency of each letter
    for i in range(26):
        if cnt[i] > 0:
            ans -= (cnt[i] * (cnt[i] + 1) // 2)
    
    # Printing the final result
    print(ans)

# Invoking the main function when the script is executed
if __name__ == "__main__":
    main()
```

Notes:
- Python does not require a class definition for small scripts.
- In Python, we do not need to import a module to read from standard input; the built-in `input()` function is used.
- String characters can be directly accessed via indexing in Python, no need to convert to a char array.
- Python uses zero-based indexing, so `ord(ch) - ord('a')` is used to convert a letter to its corresponding index (0-25) for 'a' through 'z'.
- Python uses `//` for integer division to ensure the result is an integer, which matches the behavior of Java's `/` operator when used with integers.
