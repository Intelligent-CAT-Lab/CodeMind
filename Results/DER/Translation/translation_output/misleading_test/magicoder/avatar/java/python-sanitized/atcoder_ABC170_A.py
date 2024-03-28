# Python code

# Read input
count = list(map(int, input().split()))

# Initialize answer
answer = 0

# Iterate over the count list
for i in range(5):
    if count[i] == 0:
        answer = i
        break

# Print the answer
print(answer + 1)