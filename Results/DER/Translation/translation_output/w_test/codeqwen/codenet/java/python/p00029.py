Here is the Python equivalent of the Java code:

```python
import re

def main():
    s = input().split()
    r = [s.count(word) for word in s]
    max_index = r.index(max(r))
    print(s[max_index], end=" ")
    max_length = max(len(word) for word in s)
    for word in s:
        if len(word) == max_length:
            print(word)

if __name__ == "__main__":
    main()
```

This Python code does the following:

1. It reads a string from the user, splits it into words, and stores them in a list.
2. It counts the frequency of each word in the list and stores these frequencies in another list.
3. It finds the index of the word with the maximum frequency and prints it.
4. It finds the word with the maximum length and prints it.
