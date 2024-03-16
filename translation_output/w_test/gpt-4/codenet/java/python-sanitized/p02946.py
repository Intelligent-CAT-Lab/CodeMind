# Get input as integers
K, X = map(int, input().split())

# Loop through the range and print the numbers
for i in range(X - K + 1, X + K):
    print(i, end=' ')
print()  # For a newline at the end