def count(pnum):
    result = 0
    for i in range(pnum):
        if 2**i <= pnum:
            result = 2**i
        else:
            break
    return result

# Read input from user
pnum = int(input())

# Calculate and print the result using the count function
print(count(pnum))