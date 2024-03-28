# Reading the input as integers from the user
H, A, B = map(int, input().split())

ans = 0

# Looping through the range from A to B inclusive
for i in range(A, B + 1):
    if H % i == 0:
        ans += 1

# Printing the result
print(ans)