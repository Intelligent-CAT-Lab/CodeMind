```python
def main():
    n = int(input())
    num = [0] * 100

    for i in range(100):
        if i == 0:
            num[i] = 2
        elif i == 1:
            num[i] = 1
        else:
            num[i] = num[i-1] + num[i-2]

    print(num[n])

if __name__ == "__main__":
    main()
```
