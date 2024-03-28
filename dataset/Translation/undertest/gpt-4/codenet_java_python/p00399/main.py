# Read input from user
numDog_str = input().split(" ")

# Convert the string inputs to integers and calculate the sum
result = sum(map(int, numDog_str))

# Print the result
print(result)