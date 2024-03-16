# Read the input as two integers separated by space
K, X = map(int, input().split())

# Check the condition and print the result
if X <= 500 * K:
    print("Yes")
else:
    print("No")