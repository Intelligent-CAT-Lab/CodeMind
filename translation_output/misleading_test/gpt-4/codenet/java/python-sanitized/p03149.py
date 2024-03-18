# Read input numbers as space-separated integers from the user
N = list(map(int, input().split()))

# Sort the list of numbers
N.sort()

# Compare if the sorted list matches the specified condition
ans = N == [1, 4, 7, 9]

# Print the result
if ans:
    print("YES")
else:
    print("NO")