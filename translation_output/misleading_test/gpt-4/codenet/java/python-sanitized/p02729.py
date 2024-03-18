# Read the input by splitting the input string and converting to integers
n, m = map(int, input().split())

# Calculate combinations for n and m
n_comb = n * (n - 1) // 2
m_comb = m * (m - 1) // 2

# Calculate and print the result
print(n_comb + m_comb)