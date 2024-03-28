```python
def main():
    s = input()
    a = 'A'
    sum = 0
    for c in s:
        if ord(c) <= ord(a):
            sum += 1
        a = c
    print(sum)

if __name__ == "__main__":
    main()
```  
