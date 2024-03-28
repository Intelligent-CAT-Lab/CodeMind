# Since the given Java code is using BufferedReader and Scanner for input,
# we will use input() in Python to read from standard input
# Note: This solution assumes the input will be provided as space-separated numbers on a single line.

# Read integers from input 
a, b = map(int, input().split())

# Calculate sum of a and b
k = a + b

# Check if the sum is even and output the average or "IMPOSSIBLE"
if k % 2 == 0:
    print(k // 2)  # Use integer division for Python 3
else:
    print("IMPOSSIBLE")