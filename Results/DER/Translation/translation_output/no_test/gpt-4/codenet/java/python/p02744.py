Here's the Python translation of your Java code:

```python
def func(n):
    if n == 1:
        return ['a']
    else:
        prev_list = func(n - 1)
        new_list = []
        for s in prev_list:
            max_char = max(s)
            for c in range(ord('a'), ord(max_char) + 2):
                new_string = s + chr(c)
                new_list.append(new_string)
        return new_list

def main():
    n = int(input())
    lst = func(n)
    for s in lst:
        print(s)

if __name__ == "__main__":
    main()
```

This Python code maintains the structure and logic of your Java program, translating the recursive list-generation behavior from Java to Python syntax. The major differences include Python using dynamic typing, list comprehension, and Python's `max()` function to find the maximum letter in a string.
