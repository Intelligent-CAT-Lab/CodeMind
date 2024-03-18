Below is the translated code from Java to Python:

```python
# Getting the input from user and splitting by space
A, B, C = map(int, input().split())

# Calculating the value of N
N = B // A

# Printing the result based on the condition
if N > C:
    print(C)
else:
    print(N)
```

Here is a brief explanation for each part of the code translation:

1. Java's Scanner class is replaced with Python's `input().split()` method to read space-separated integers from standard input, that are then mapped to integers using `map(int, ...)`.
2. Java's arithmetic and casting is translated into Python's integer division `//`, which inherently gives an integer result.
3. The if-else logic is pretty much the same in both languages.
4. Print statements in Python do not require `System.out.println` but are rather simple calls to `print()`.

When you run the Python program with the test input `2 11 4`, it should give you the expected output `-26`. However, based on the provided code and the logic, the expected output seems to be mistaken because with the given logic the output should be a non-negative integer, either `5` or `4` (if `B=11`, `A=2`, then `N=5`, and since `5` is greater than `C`, the output will be `C` which is `4`). 

Please validate if the provided expected output `-26` is correct for the logic described in the code. If not, you might need to adjust the test case or check the logic of the original Java code.
