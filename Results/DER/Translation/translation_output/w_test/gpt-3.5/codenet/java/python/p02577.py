```python
def main():
    s = input()
    c = 0
    for char in s:
        c += int(char)
    if c % 9 == 0:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()
```
