# Read input from the user
n, k = map(int, input().split())

# Print "Yes" if the product of n and k is odd, otherwise print "No"
if (n * k) % 2 == 1:
    print("Yes")
else:
    print("No")