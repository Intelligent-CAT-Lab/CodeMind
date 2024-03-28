```python
def main():
    s = input()
    str = ""

    i = 0
    while i < len(s):
        if s[i] == '.':
            str += '0'
        else:
            if s[i] == '-' and s[i + 1] == '.':
                str += '1'
                i += 1
            else:
                str += '2'
                i += 1
        i += 1

    print(str)

if __name__ == "__main__":
    main()
```
