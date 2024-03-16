```python
def main():
    N = int(input())
    for i in range(N+1):
        if int(i*1.08) == N:
            print(i)
            return
    print(":(")

if __name__ == "__main__":
    main()
```
