Here is the equivalent Python code for the Java program provided:

```python
# read the input from the user
str1 = input()
# split the input based on space
s = str1.split(" ")
# convert the split strings to integers
i1 = int(s[0])
i2 = int(s[1])

# calculate count
count = i1 // i2
# add the remainder of the division to count
count += i1 % i2
# print the result
print(count)
```

To test this with the provided test case in Python, you can directly input `10 5` to the program, and it should output `2` as expected.
