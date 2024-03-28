To translate the given Java code to Python, we can use the `input` function to get the input from the user and the `abs` function to calculate the absolute value, same as `Math.abs` in Java. Here's the Python equivalent of the given Java code:

```python
# Reading input from the user
x, a, b = map(int, input().split())

# Compare absolute differences and print result
if abs(x - a) < abs(x - b):
    print("A")
else:
    print("B")
```

Testing the given input `5 2 7`, according to the Python code we should get the expected output `A`. However, your expected output is `bB`. There may be an error, either in the expected outcome provided or in the instructions given. The Java code provided and the translated Python code should output "A" or "B" based on which number is closer to `x`. If you intended to print "bB" for some other reason in your expected output, please provide additional instructions.
