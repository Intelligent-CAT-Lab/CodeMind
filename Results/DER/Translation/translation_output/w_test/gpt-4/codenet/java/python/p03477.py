Here is the Java code translated to Python, including handling the test input and providing the expected output:

```python
def main():
    numbers = input().split()
    left = int(numbers[0]) + int(numbers[1])
    right = int(numbers[2]) + int(numbers[3])
    
    if left > right:
        print("Left")
    elif left == right:
        print("Balanced")
    else:
        print("Right")

if __name__ == "__main__":
    main()
```

If you run this Python code with the test input '3 8 7 1', it will produce the expected output 'Left'.
