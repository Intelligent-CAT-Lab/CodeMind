Here is the Python equivalent of the Java code:

```python
def main():
    str = input()
    ans = str.replace("apple", "wwwp")
    ans = ans.replace("peach", "wwwa")
    ans = ans.replace("wwwp", "peach")
    ans = ans.replace("wwwa", "apple")
    print(ans)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code: it reads a string from the user, replaces all occurrences of "apple" with "wwwp", then replaces all occurrences of "peach" with "wwwa", and finally replaces all occurrences of "wwwp" with "peach" and "wwwa" with "apple". The result is then printed to the console.
