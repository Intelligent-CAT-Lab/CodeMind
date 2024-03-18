# Test input
n = int(input())

# Initialize variables
a = [0] * 15
i = 0

# Conversion process
while n > 0:
    a[i] = (n + 1) % 3 - 1
    n = (n - a[i]) // 3
    i += 1

# Output
result = ""
while i > 0:
    i -= 1
    if a[i] == 0:
        result += "0"
    elif a[i] > 0:
        result += "+"
    else:
        result += "-"
print(result)