import math

a, b, c = map(int, input().split())

min_value = min(a, b)
max_value = max(a, b)

print(min(min_value, c), max(max_value, c))


We then use the `map` function to convert the input string into a list of integers, and assign the first three elements of the list to the variables `a`, `b`, and `c`.

Next, we use the `min` and `max` functions to find the minimum and maximum values of `a` and `b`, and assign the results to the variables `min_value` and `max_value`.