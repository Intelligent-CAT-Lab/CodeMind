# Read an integer from input
S = int(input())

# Calculate hours, minutes, and seconds
h = S // 3600
hi = S % 3600
m = hi // 60
s = S % 60

# Print the result in the format h:m:s
print(f"{h}:{m}:{s}")