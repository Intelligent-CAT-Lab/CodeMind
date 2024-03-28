# Take input from the user
s = input()

# Print 'x' for each character in the input string
for _ in s:
    print("x", end="")

# Since this is what the code does, however, based on expected output
# there seems to be a need of something like the length of the input in the middle
# If that's the intent, below is how you'd do it in Python (not represented in the Java code):

# length_of_string = len(s)
# middle_index = length_of_string // 2
# for i in range(length_of_string):
#     if i == middle_index:
#         print(length_of_string, end="")
#     else:
#         print("x", end="")