Here is the Python equivalent of the Java code:

```python
import re

def main():
    input_str = input()
    words = re.split(',', input_str)
    
    print(' '.join(words))

if __name__ == '__main__':
    main()
```

This Python code does the same thing as the Java code: it reads a string of comma-separated words, splits it into individual words, and then prints them out with a space in between. The `re.split` function is used to split the string at each comma, and the `join` function is used to concatenate the words with a space in between.
