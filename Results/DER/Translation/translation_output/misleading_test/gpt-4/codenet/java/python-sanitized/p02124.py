# Read an integer from the user input
x = int(input())

# Initialize the answer string
ans = "ai1333"

# Append additional '3's based on the input value
for i in range(x // 100):
    ans += "3"

# Output the result
print(ans)