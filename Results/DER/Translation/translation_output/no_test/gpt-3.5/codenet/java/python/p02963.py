```python
def main():
    s = int(input())
    a = 1000000000
    print(f"0 0 {a} 1 {(a-s%a)%a} {(s-1)//a+1}")

if __name__ == "__main__":
    main()
```
