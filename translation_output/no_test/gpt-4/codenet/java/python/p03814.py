Here's the translated Python code:
```python
def solve():
    s = input()
    n = len(s)

    from_index = 0
    to = n - 1
    for i in range(n):
        if s[i] == 'A':
            from_index = i
            break
    for i in range(n - 1, -1, -1):
        if s[i] == 'Z':
            to = i
            break

    print(to - from_index + 1)

if __name__ == "__main__":
    solve()
``` 

This code snippet reads a string from standard input, finds the positions of the first 'A' and the last 'Z' in the string, and prints the length of the substring starting from the first 'A' and ending with the last 'Z'. Note that in Java, printing and scanning are handled using `Scanner` and `Printer` classes, while in Python, we use the built-in `input()` function for scanning and `print()` for printing.
