```python
def main():
    r, g, b = map(int, input().split())
    sum_val = (r*100) + (g*10) + b

    if sum_val % 4 == 0:
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()
```
