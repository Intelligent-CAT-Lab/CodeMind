```python
def main():
    S = int(input())
    yy = S // 100
    mm = S % 100

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
