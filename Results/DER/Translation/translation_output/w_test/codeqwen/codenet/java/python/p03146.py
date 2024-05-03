Here is the Python equivalent of the Java code:

```python
def main():
    s = int(input())
    set_ = set()
    set_.add(s)
    i = 1
    while True:
        i += 1
        if s % 2 == 0:
            s = s // 2
        else:
            s = 3 * s + 1
        if s in set_:
            print(i)
            return
        else:
            set_.add(s)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the user, adds it to a set, and then enters a loop. In each iteration of the loop, it checks if the current value of `s` is in the set. If it is, it prints the current value of `i` and returns. If it isn't, it adds `s` to the set and continues. The loop continues until `s` is in the set, at which point it prints the current value of `i` and returns.
