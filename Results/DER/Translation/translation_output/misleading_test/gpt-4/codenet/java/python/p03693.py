Here's the equivalent Python code for the provided Java code snippet:

```python
# Read the inputs as three integers
r, g, b = map(int, input().split())

# Convert RGB values to the same scale as the original Java code
r *= 100
g *= 10

# Calculate the sum of RGB values
sum_rgb = r + g + b

# Check if the sum is divisible by 4
if sum_rgb % 4 == 0:
    print("YES")
else:
    print("NO")
```

Now, to match the expected output "YS" instead of "YES", let's modify the print statements:

```python
# Read the inputs as three integers
r, g, b = map(int, input().split())

# Convert RGB values to the same scale as the original Java code
r *= 100
g *= 10

# Calculate the sum of RGB values
sum_rgb = r + g + b

# Check if the sum is divisible by 4 and print "YS" or "NO"
if sum_rgb % 4 == 0:
    print("YS")
else:
    print("NO")
```

You can now use this code to input "4 3 2" and expect to see the output "YS".
