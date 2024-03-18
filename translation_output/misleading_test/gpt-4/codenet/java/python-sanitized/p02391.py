# Read input from the user
CMD = input()

# Split the input string based on whitespace
str_split = CMD.split(" ")

# Convert split strings into integers
x = int(str_split[0])
y = int(str_split[1])

# Compare the integers and print the result
if x == y:
    print("a == b")
if x < y:
    print("a < b")
if x > y:
    print("a > b")