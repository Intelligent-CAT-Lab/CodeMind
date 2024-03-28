```python
def main():
    s = input()
    c = 0
    for i in range(len(s)):
        c += int(s[i])

    if c % 9 == 0:
        print("Yes#")
    else:
        print("No")

if __name__ == "__main__":
    main()
```
