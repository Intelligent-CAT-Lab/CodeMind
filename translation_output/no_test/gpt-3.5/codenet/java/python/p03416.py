```python
def main():
    a, b = map(int, input().split())
    count = 0
    for i in range(a, b+1):
        array = [0] * 5
        array[0] = i % 10
        array[1] = i // 10 % 10
        array[2] = i // 100 % 10
        array[3] = i // 1000 % 10
        array[4] = i // 10000 % 10
        if array[0] == array[4] and array[1] == array[3]:
            count += 1
    print(count)

if __name__ == "__main__":
    main()
```
