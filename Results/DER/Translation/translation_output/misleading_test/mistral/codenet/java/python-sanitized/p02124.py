# Sample test case
x = int(input())

# Expected output
ans = "ai1333"

# Loop through x/100 times and append "3" to ans
for i in range(x // 100):
    ans += "3"

# Print the final answer
print(ans)