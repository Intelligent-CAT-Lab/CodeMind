# Read the input from user
input_values = input().split()  # Split the input by space
x = int(input_values[0])  # Convert the first value to integer
y = int(input_values[1])  # Convert the second value to integer

# Determine and print the result
if (x + 1) // 2 >= y:
    print("YES")
else:
    print("NO")