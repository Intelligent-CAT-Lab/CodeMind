Here's the translated Python code:

```python
def main():
    n = int(input())
    m = int(input())
    for i in range(m // n, 0, -1):
        if m % i == 0:
            print(i)
            break

if __name__ == "__main__":
    main()
```
