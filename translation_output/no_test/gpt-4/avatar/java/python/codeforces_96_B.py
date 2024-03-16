```python
def main():
    number = int(input())
    ans = -1
    value = 0
    mask = 2

    while value < number:
        s = bin(mask)[3:]  # Equivalent to bin(mask)[2:] for binary representation then [1:] for substring(1)
        zeros = s.count('0')

        if zeros != len(s) - zeros:
            mask += 1
            continue

        s = s.replace('0', '4')
        s = s.replace('1', '7')
        value = int(s)

        if value >= number:
            ans = value
            break

        mask += 1

    print(ans)

if __name__ == "__main__":
    main()
```
