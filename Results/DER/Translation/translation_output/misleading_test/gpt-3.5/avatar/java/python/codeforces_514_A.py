```python
def main():
    x = int(input())
    new_number = 0
    list = []

    while x > 0:
        r = x % 10
        if 9 - r < r:
            if x // 10 == 0 and 9 - r == 0:
                list.append(r)
            else:
                list.append(9 - r)
        else:
            list.append(r)
        x = x // 10

    pow = 0
    for i in range(len(list)):
        new_number += list[i] * (10 ** pow)
        pow += 1

    print(new_number)

if __name__ == "__main__":
    main()
```
