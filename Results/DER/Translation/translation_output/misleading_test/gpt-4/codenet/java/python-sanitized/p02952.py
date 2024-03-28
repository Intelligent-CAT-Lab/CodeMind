# Taking the input from the user
a = int(input())

# Initializing the count variable
c = 0

# Looping through all numbers from 1 to a (inclusive)
for i in range(1, a + 1):
    # Checking if the number of digits is odd
    if len(str(i)) % 2 != 0:
        c += 1
        
# Printing the result
print(c)