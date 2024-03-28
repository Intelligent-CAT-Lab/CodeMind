```python
def main():
    n = input()
    num = len(n)
    
    for i in range(num):
        if n[i].islower():
            print(n[i].upper(), end='')
        elif n[i].isupper():
            print(n[i].lower(), end='')
        else:
            print(n[i], end='')
    
    print()

if __name__ == "__main__":
    main()
```
