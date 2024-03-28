# Read the input as a string and split it into a list
numDog = input().split(" ")

result = 0
# Loop through the list and convert each element to an integer and add to the result
for i in range(len(numDog)):
    result += int(numDog[i])

# Output the result
print(result)