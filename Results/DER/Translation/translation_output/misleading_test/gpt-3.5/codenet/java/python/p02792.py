```python
def main():
    n = int(input())
    
    result = 0
    array = [[0 for _ in range(10)] for _ in range(10)]
    
    for i in range(1, n+1):
        head = int(str(i)[0])
        tail = i % 10
        array[head][tail] += 1
    
    keta = len(str(n))
    for i in range(1, n+1):
        head = int(str(i)[0])
        tail = i % 10
        if tail == 0:
            continue
        result += array[tail][head]
    
    print(result)

if __name__ == "__main__":
    main()
```
