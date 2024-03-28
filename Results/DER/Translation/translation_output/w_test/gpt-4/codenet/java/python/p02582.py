Here is the translated Python code:

```python
def main():
    s = input()

    if s == 'RRR':
        res = 3
    elif 'RR' in s:
        res = 2
    elif 'S' in s:
        res = 1
    else:
        res = 0

    print(res)

if __name__ == "__main__":
    main()
```

When you run this code with the test input "RRS", it will produce the expected output of `2`. 

Note that in Python, strings are iterable, and you can use the `in` keyword to check if a substring exists within another string. So instead of checking the positions of 'R' and 'S' individually, we can simplify the conditions to check for the presence of the required substrings directly.
