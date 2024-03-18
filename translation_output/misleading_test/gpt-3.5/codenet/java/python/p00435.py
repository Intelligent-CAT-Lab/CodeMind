```python
def main():
    s = ""
    for c in input():
        s += chr((ord(c) - 42) % 26 + 65)
    print(s)

if __name__ == "__main__":
    main()
```
