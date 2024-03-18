# Read input from user and split into three integers
a, b, c = map(int, input().split())

# Check the conditions and print the result accordingly
if (a == 5 and b == 7 and c == 5) or (a == 5 and b == 5 and c == 7) or (a == 7 and b == 5 and c == 5):
    print("YES")
else:
    print("NO")

# Sample test case in Python
# To run the test case, you'll need to input the numbers "5 5 7" (without quotes) when prompted.