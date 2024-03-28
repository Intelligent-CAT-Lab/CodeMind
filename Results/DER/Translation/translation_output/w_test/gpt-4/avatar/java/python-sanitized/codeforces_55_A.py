# read the input from user
n = int(input())

# check if the number is a power of two
if (n & (n - 1)) == 0:
    print("YES")
else:
    print("NO")