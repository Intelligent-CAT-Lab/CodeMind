```python
def main():
    number = int(input())
    ans, value = -1, 0
    mask = 2
    
    while value < number:
        s = bin(mask)[2:]
        mask += 1
        zeros = s.count('0')

        if zeros != len(s) - zeros:
            continue
        
        s = s.replace('0', '4')
        s = s.replace('1', '7')
        value = int(s)
    
    print(value)

if __name__ == "__main__":
    main()
```
