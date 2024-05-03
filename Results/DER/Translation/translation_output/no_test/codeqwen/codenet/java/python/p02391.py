Here is the Python equivalent of the Java code:

```python
CMD = input()
str = CMD.split() 

x = int(str[0])
y = int(str[1])

if x == y:
    print("a == b")
elif x < y:
    print("a < b")
else:
    print("a > b")
```

In Python, we use the `input()` function to read a line of text from the user. The `split()` function is used to split the input into a list of words. The `int()` function is used to convert the first and second words in the list to integers. The `if` and `elif` statements are used to compare the integers and print the appropriate message. The `else` statement is used to handle the case where `x` is greater than `y`.
