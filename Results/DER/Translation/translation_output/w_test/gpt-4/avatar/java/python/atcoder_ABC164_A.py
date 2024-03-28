Here is the translated code in Python:

```python
def main():
    s, w = map(int, input().split())
    if w >= s:
        print("unsafe")
    else:
        print("safe")

if __name__ == "__main__":
    main()
```

This Python code does the same as the Java code provided: it reads a line of input, splits it into two integers *s* (representing the number of sheep) and *w* (representing the number of wolves), and then prints "unsafe" if the number of wolves is greater than or equal to the number of sheep; otherwise, it prints "safe".
