Here is the equivalent Python code for the Java code you provided:

```python
# In python, there's no need to import the Scanner class, we use the built-in input() function.
n = int(input())  # Get input and convert it to an integer

sum = 0
for i in range(1, n + 1):  # The range() function in Python is similar to the for loop in Java
    sum += i

print(sum)
```

If you're using this in a script and running it from the terminal, it will wait for your input after running. To replicate the test case:

Test input:
```
3
```

Expected output:
```
6
```
