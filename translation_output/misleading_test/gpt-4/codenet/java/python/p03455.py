Here's the Java code translated to Python:

```python
def main():
    x, y = map(int, input().split())
    if x % 2 == 0 or y % 2 == 0:
        print("Even")
    else:
        print("Odd")

if __name__ == "__main__":
    main()
```

For the given test input "3 4", calling `main()` would print "Even" to the console.
