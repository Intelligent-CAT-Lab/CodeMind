```python
def main():
    word = input()
    num = 0
    for c in word:
        if c == '+':
            num += 1
        else:
            num -= 1
    print(num)

if __name__ == "__main__":
    main()
```
