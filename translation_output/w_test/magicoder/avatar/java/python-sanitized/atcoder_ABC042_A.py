# Python code

# Read input
nums = input().split()

# Convert strings to integers
num_1 = int(nums[0])
num_2 = int(nums[1])
num_3 = int(nums[2])

# Check conditions
if num_1 == 7:
    if num_2 == 5 and num_3 == 5:
        print("YES")
    else:
        print("NO")
elif num_2 == 7:
    if num_1 == 5 and num_3 == 5:
        print("YES")
    else:
        print("NO")
elif num_3 == 7:
    if num_2 == 5 and num_1 == 5:
        print("YES")
    else:
        print("NO")