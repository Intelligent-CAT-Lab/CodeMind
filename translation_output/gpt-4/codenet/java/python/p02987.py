Here's the Java code translated to Python, enclosed inside the markdown code fences for Python:

```python
def main():
    s = sorted(input())
    if s[0] == s[1] and s[2] == s[3] and s[1] != s[2]:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()
```

In Python, we don't need to import a separate module for sorting as we did in Java (`Arrays.sort()`). We can just use the built-in `sorted()` function. Additionally, in Python, there is no need to explicitly convert the input string to a character array; strings are already iterable and can be directly sorted. The comparison logic remains the same as in the Java code.
