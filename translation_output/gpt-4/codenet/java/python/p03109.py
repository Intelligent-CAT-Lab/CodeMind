Here's the equivalent Python code for the given Java code:

```python
def main():
    time = input()[5:]
    if time[0] == '1' or int(time[1]) > 4:
        print("TBD")
    else:
        print("Heisei")

if __name__ == "__main__":
    main()
```

This Python code behaves similarly to the original Java code. It reads a string input, trims it to the last portion after the first 4 characters and compares the values to determine whether to print "TBD" or "Heisei".
