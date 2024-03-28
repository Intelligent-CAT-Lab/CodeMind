```python
def main():
    a, b, x = map(int, input().split())
    if a + b >= x and a <= x:
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()
```
