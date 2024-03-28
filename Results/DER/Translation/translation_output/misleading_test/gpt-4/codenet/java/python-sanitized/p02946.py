# Reading input
K, X = map(int, input().split())

# Outputting the range of numbers
for i in range(X - K + 1, X + K):
    print(i, end=' ')
print()  # For the newline at the end