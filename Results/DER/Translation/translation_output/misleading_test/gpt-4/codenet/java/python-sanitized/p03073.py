# Sample test case
test_input = "000"
# Expected output: 2

def min_operations(tail):
    n = len(tail)
    count = 0
    for i in range(n):
        if i % 2 == 0 and tail[i] == "0":
            count += 1
        if i % 2 == 1 and tail[i] == "1":
            count += 1
    n -= count
    return count if count < n else n

# Using the sample test case to check the function
print(min_operations(test_input))