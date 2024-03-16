```python
# no need to import any module for this code

def main():
    c = input()
    c = list(c)
    count = 0
    for i in range(len(c)):
        if c[i] == 'D' or c[i] == '?':
            count += 1
            c[i] = 'D'
        print(c[i], end='')
    print()

if __name__ == "__main__":
    main()
```
