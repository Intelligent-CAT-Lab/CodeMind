```python
def main():
    a, b, c, d = map(int, input().split())
    array = [0] * 101

    for i in range(a, b):
        array[i] += 1

    for i in range(c, d):
        array[i] += 1

    ans = sum(1 for x in array if x == 2)
    
    print(ans)

if __name__ == "__main__":
    main()
```
