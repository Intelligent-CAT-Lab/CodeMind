# Take input from the user
n = input()

# Initialize the result variable to store the updated string
result = ""

# Iterate through each character in the input string
for i in range(len(n)):

    # If the character is lowercase, convert it to uppercase
    if n[i].islower():
        result += n[i].upper()

    # If the character is uppercase, convert it to lowercase
    elif n[i].isupper():
        result += n[i].lower()

    # For any other character, just append it as it is (including space)
    else:
        result += n[i]

# Print the result
print(result)