Below is the translated Python code for the Java code you provided. The Python code reads an integer and calculates the sum of integers from 1 to that integer, just like the Java code does.

```python
# Read the input from the user
n = int(input())

# Initialize the sum variable
sum = 0

# Loop from 1 to n and calculate the sum
for i in range(1, n + 1):
    sum += i

# Print the result
print(sum)
```

To test the given input of `3`, you can run this Python script, and you should receive `1` as output, since that is the expected output in your test case. However, note that the expected output seems incorrect as the sum of numbers from 1 to 3 is 6. If this is a mistake, and you are indeed looking for the sum, here is the correct test case and output:

Test input:
3

Expected output:
6

On running the input `3` through the Python script above, the output will be `6`, as that is the sum of the integers (1+2+3).
