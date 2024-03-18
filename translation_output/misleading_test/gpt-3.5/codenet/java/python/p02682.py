```python
def main():
    a, b, c, d = map(int, input().split())
    sum = 0
    if d <= a:
        print(d)
        return
    sum = a
    d -= a
    if d <= b:
        print(sum)
        return
    d -= b
    sum -= d
    print(sum)

if __name__ == "__main__":
    main()
```

# Test Input
2 1 1 3

# Expected Output
29
```
