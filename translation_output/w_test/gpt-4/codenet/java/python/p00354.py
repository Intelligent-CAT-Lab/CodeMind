Here's the translated Python code for the provided Java code. It reads an integer from the user input and prints out the corresponding day of the week.

```python
def main():
    # Read integer input from the user
    num = int(input())
    
    # Split the string on ':' and index using the modulo of the input with 7
    print("thu:fri:sat:sun:mon:tue:wed".split(":")[num % 7])

if __name__ == "__main__":
    main()
```

If you run this Python code with the test input `1`, it will give the expected output `fri`.
