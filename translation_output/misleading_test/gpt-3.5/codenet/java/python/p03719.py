```python
def main():
    a, b, c = map(int, input().split())
    
    result = "No"
    if a <= c <= b:
        result = "Yes"
    
    print(result)

if __name__ == "__main__":
    main()
```
