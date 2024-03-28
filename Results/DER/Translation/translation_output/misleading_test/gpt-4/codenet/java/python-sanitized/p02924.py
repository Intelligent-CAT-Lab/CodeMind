# INPUT
n = int(input())

# MAIN PROCESSING
result = 0
for i in range(n - 1, 0, -1):
    result += i

# OUTPUT
print(result)