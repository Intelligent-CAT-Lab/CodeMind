# Get the input from user
a, b, c = map(int, input().split())

# Loop through the range to check the condition
for i in range(5000):
    if a * i % b == c:
        print("YES")
        break
else:  # This else is part of the for loop (executes if loop didn't break)
    print("NO")