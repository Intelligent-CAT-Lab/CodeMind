```python
def check_leap(y):
    return y % 400 == 0 or (y % 4 == 0 and y % 100 != 0)

def main():
    y = int(input())
    leap = check_leap(y)
    sum = 0

    while True:
        y += 1
        if check_leap(y):
            sum += 366
        else:
            sum += 365

        if sum % 7 == 0:
            if (check_leap(y) and leap) or (not check_leap(y) and not leap):
                print(y)
                return

if __name__ == "__main__":
    main()
```
