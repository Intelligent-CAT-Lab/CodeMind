Here is the Python equivalent of the Java code:

```python
num = [1, 4, 8, 16, 32, 64, 128, 256, 512, 9, 27, 81, 243, 729, 16, 64, 256, 1024, 25, 125, 625, 36, 216, 49, 343, 64, 512, 81, 729, 100, 1000, 121, 144, 169, 196, 225, 256, 289, 324, 361, 400, 441, 484, 529, 576, 625, 676, 729, 784, 841, 900, 961]
num.sort()
X = int(input())
max_val = -1
for i in range(len(num) - 1, -1, -1):
    n = num[i]
    if n <= X:
        max_val = max(max_val, n)
        break
print(max_val)
```

This Python code does the same thing as the Java code. It first sorts the list of numbers in ascending order. Then it takes an integer input from the user and iterates over the sorted list in reverse order. If it finds a number that is less than or equal to the user's input, it updates the maximum value and breaks out of the loop. Finally, it prints the maximum value.
