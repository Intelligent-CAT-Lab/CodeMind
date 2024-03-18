Here's the translation of the provided Java code to Python:

```python
def main():
    s = int(input())
    yy = s // 100
    mm = s % 100

    if 1 <= yy <= 12:
        if 1 <= mm <= 12:
            print("AMBIGUOUS")
        else:
            print("MMYY")
    else:
        if 1 <= mm <= 12:
            print("YYMM")
        else:
            print("NA")

if __name__ == "__main__":
    main()
```

When using this Python script with the test input `1905`, you can expect the output to be `YYMM`.
