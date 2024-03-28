# Read input from user
a, b, c, d = map(int, input().split())

# Calculate products
product1 = a * b
product2 = c * d

# Print the smaller of the two products
print(min(product1, product2))

# Sample test execution
if __name__ == "__main__":
    #