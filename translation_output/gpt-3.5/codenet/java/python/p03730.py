```python
def main():
    a = int(input())
    b = int(input())
    c = int(input())

    for i in range(5000):
        if a * i % b == c:
            print("YES")
            return

    print("NO")

if __name__ == "__main__":
    main()
```
