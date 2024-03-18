```python
def main():
    a = list(map(int, input().split()))
    b = a[0] + a[1]*5 + a[2]*10 + a[3]*50 + a[4]*100 + a[5]*500
    if b >= 1000:
        print("1")
    else:
        print("0")

if __name__ == "__main__":
    main()
```

Test Input:
3 1 4 0 4 1

Expected Output:
88
```
