Here's the Java code translated into Python. We can approach this by working with the number as a string to easily loop through its digits from last to first, mirroring the behavior of the original Java code, and then reconstruct the number with Python's built-in functionality:

```python
x = int(input())

new_number_list = []

# Using string manipulation for simplicity
x_str = str(x)
length = len(x_str)

for i in range(length - 1, -1, -1):  # Loop through the number from end to start
    r = int(x_str[i])
    if 9 - r < r:
        if i == 0 and 9 - r == 0:  # If it's the first digit and 9-r is 0, use r
            new_number_list.insert(0, r)
        else:
            new_number_list.insert(0, 9 - r)
    else:
        new_number_list.insert(0, r)

# Construct the new number
new_number = int(''.join(map(str, new_number_list)))

print(new_number)
```

Sample test with the provided input:

```python
# Test input: 5728
# Expected output: 4221

x = int(input("Enter a number: "))

new_number_list = []

# Using string manipulation for simplicity
x_str = str(x)
length = len(x_str)

for i in range(length - 1, -1, -1):  # Loop through the number from end to start
    r = int(x_str[i])
    if 9 - r < r:
        if i == 0 and 9 - r == 0:  # If it's the first digit and 9-r is 0, use r
            new_number_list.insert(0, r)
        else:
            new_number_list.insert(0, 9 - r)
    else:
        new_number_list.insert(0, r)

# Construct the new number
new_number = int(''.join(map(str, new_number_list)))

print("Transformed number:", new_number)
```

If you run this code with the sample test input "5728", you should get the expected output "4221".
