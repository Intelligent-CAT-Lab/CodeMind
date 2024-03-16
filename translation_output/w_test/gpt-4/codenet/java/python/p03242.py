The following is the Java code translated into Python. In Python, we won't need an explicit input scanner since we can use the built-in function `input()`. Instead of manipulating a character array, we'll work directly with a string and its characters.

```python
def main():
    S = input().strip()
    S = ''.join(['9' if ch == '1' else '1' for ch in S])
    print(S)

if __name__ == "__main__":
    main()
```

Given the test input `119`, this program should print `991` as expected.
