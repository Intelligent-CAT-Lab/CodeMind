Here's your Java code translated into Python:

```python
# No need to import anything since Python has built-in input functions

def main():
    n, k = map(int, input().split())  # Reads two space-separated integers from stdin
    if n % k == 0:
        print(0)
    else:
        print(1)

if __name__ == "__main__":
    main()
```

This Python script replicates the functionality of the Java code. It reads two numbers from standard input, checks if the first is divisible by the second, and prints either 0 or 1 based on that condition.
