```python
def main():
    try:
        num1 = int(input())
        num2 = int(input())
        if abs(num1 - num2) <= 1:
            print("Brown")
        else:
            print("Alice")
    except Exception as e:
        print(e)

if __name__ == "__main__":
    main()
```
