Here is the Python equivalent of the Java code:

```python
odd = 0
for i in range(3):
    odd += int(input()) % 2
print("Hom" if odd >= 2 else "Tem")
```

In Python, we use the `input()` function to get user input, and we use the `range()` function to loop 3 times. We also use the `int()` function to convert the user input from a string to an integer. The `%` operator is used to get the remainder of a division, which is useful for checking if a number is odd. If the sum of the odd numbers is 2 or more, we print "Hom", otherwise we print "Tem".
