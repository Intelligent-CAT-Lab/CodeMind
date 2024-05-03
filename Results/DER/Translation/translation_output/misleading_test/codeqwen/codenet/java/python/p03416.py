Here is the Python equivalent of the Java code:

```python
def count_palindromes(a, b):
    count = 0
    for i in range(a, b+1):
        array = [int(x) for x in str(i)]
        if array[0] == array[-1] and array[1] == array[-2]:
            count += 1
    return count

a, b = map(int, input().split())
print(count_palindromes(a, b))
```

This Python code does the same thing as the Java code. It takes two integers as input, counts the number of palindromes between them (where a palindrome is a number that reads the same backward as forward), and prints the count. The function `count_palindromes` does the counting, and the main part of the program reads the input and calls the function.
