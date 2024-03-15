```python
def main():
    s = input().strip()

    while "0B " in s or "1B " in s:
        s = s.replace("0B ", "")
        s = s.replace("1B ", "")

    s = s.replace(" B ", "")

    print(s)

if __name__ == "__main__":
    main()
```
