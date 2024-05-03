Here is the Python equivalent of the Java code:

```python
def main():
    n = int(input())
    square = n * n
    odd = [i for i in range(1, square + 1, 2)]
    even = [i for i in range(2, square + 1, 2)]
    
    loop = square // n
    div = loop // 2
    
    for i in range(1, loop + 1):
        for j in range(div):
            if i % 2 == 1:
                print(odd.pop(0), even.pop(-1), end=" ")
            else:
                print(even.pop(0), odd.pop(-1), end=" ")
        print()

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the user, creates two lists of odd and even numbers from 1 to the square of the input number, and then prints the numbers in a specific pattern. The `pop` method is used to remove and return the first or last element from the list, depending on the value of `i`. The `end=" "` argument in the `print` function is used to print the numbers on the same line separated by a space.
