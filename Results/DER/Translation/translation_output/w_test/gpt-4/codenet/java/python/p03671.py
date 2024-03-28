Sure, here is the equivalent Python code that performs the same task as the given Java code. 

```python
# Read input from the user
a, b, c = map(int, input().split())

# Create a list with the values
sum_list = [a, b, c]

# Sort the list
sum_list.sort()

# Print the sum of the two smallest numbers
print(sum_list[0] + sum_list[1])
```

The Python code takes the three integers as input and creates a list with them. It then sorts the list and prints the sum of the first two elements, which are the two smallest numbers after sorting.

Here's how you would use it based on the provided test case:

Test input:
700 600 780

Expected output:
1300

```python
# This code snippet would be like entering the test input into the Python code:
user_input = '700 600 780'  # Simulating user input
a, b, c = map(int, user_input.split())
sum_list = [a, b, c]
sum_list.sort()
print(sum_list[0] + sum_list[1])
```

And this would yield the expected output:

```
1300
```
