import math

a = int(input("Enter the first number: "))
b = int(input("Enter the second number: "))

ans = math.abs(a - b)

print(ans)


We then prompt the user to enter two numbers, `a` and `b`, using the `input()` function. We convert the input strings to integers using the `int()` function.

Next, we calculate the absolute difference between `a` and `b` using the `abs()` function, and store the result in the `ans` variable.