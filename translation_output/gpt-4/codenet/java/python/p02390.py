Here's the translated Java code to Python:

```python
def main():
    S = int(input())
    h = S // 3600
    hi = S % 3600
    m = hi // 60
    s = S % 60
    print(f"{h}:{m}:{s}")

if __name__ == "__main__":
    main()
```

The Python code uses standard input to receive an integer like the Java code. It then performs the same calculations for hours, minutes, and seconds, and prints them in the same format. Python's string formatting (f-string) is used to print the values in the desired format.
