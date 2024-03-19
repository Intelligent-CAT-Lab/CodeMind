# Sample test case
input = "1222"

# Expected output
output = "0+2+2+2=7"

# Initialize variables
a = int(input[0])
b = int(input[1])
c = int(input[2])
d = int(input[3])

# Initialize output list
ans = []

# Check if a + b + c + d == 7
if a + b + c + d == 7:
    ans.append("+")
    ans.append("+")
    ans.append("+")

# Check if a + b + c - d == 7
elif a + b + c - d == 7:
    ans.append("+")
    ans.append("+")
    ans.append("-")

# Check if a + b - c + d == 7
elif a + b - c + d == 7:
    ans.append("+")
    ans.append("-")
    ans.append("+")

# Check if a - b + c + d == 7
elif a - b + c + d == 7:
    ans.append("-")
    ans.append("+")
    ans.append("+")

# Check if a + b - c - d == 7
elif a + b - c - d == 7:
    ans.append("+")
    ans.append("-")
    ans.append("-")

# Check if a - b + c - d == 7
elif a - b + c - d == 7:
    ans.append("-")
    ans.append("-")
    ans.append("+")

# Check if a - b - c + d == 7
elif a - b - c + d == 7:
    ans.append("-")
    ans.append("-")
    ans.append("+")

# Check if a - b - c - d == 7
elif a - b - c - d == 7:
    ans.append("-")
    ans.append("-")
    ans.append("-")

# Print output
print(a + ans[0] + b + ans[1] + c + ans[2] + d + "=7")