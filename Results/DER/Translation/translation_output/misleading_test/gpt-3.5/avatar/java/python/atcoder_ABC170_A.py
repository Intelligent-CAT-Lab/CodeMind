```python
def main():
    numbers = list(map(int, input().split()))
    count = [0] * 5
    answer = 0
    
    for i in range(5):
        x = numbers[i]
        count[i] += x
        
        if count[i] == 0:
            answer = i
    
    print(answer + 1)

if __name__ == "__main__":
    main()
```
