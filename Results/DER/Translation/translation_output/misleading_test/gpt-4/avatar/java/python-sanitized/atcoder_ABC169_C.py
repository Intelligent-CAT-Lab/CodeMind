# Reading input
a, b = input().split()
a = int(a)  # Convert input string to integer
b = float(b)  # Convert input string to float

# Perform computation
c = round(b * 100)
d = a * c
result = d // 100  # Use integer division for the final result

# Output the result
print(result)