Here's the translated code to Python:

```python
def p03737():
    # Using list comprehension to get the first letters
    first_letters = [input().strip()[0].upper() for _ in range(3)]
    # Join and print the uppercase first letters
    print(''.join(first_letters))

# If this file is the main program, execute the function
if __name__ == "__main__":
    p03737()
```
