# Read input from the user
n, k = map(int, input().split())

# Check if n is divisible by k and print the result
if n % k == 0:
    print(0)
else:
    print(1)