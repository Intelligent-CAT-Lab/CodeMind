# Reading input as three space-separated integers
a = list(map(int, input().split()))

# Check if either the first two elements are both 1 or the third element is 1
if (a[0] == 1 and a[1] == 1) or (a[2] == 1):
    print("Open")
else:
    print("Close")