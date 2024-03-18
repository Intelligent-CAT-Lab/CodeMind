```python
def main():
    a, b = map(int, input().split())
    count = 0
    for i in range(a, b+1):
        digits = [int(d) for d in str(i)]
        if len(digits) == 5 and digits[0] == digits[4] and digits[1] == digits[3]:
            count += 1
    print(count)

if __name__ == "__main__":
    main()
```
