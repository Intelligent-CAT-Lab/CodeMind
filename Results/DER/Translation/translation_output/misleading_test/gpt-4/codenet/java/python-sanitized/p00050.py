# Get the input from user
str_input = input()

# Replace the words by using intermediate placeholders
ans = str_input.replace("apple", "wwwp")
ans = ans.replace("peach", "wwwa")
ans = ans.replace("wwwp", "peach")
ans = ans.replace("wwwa", "apple")

# Print the result
print(ans)