# Read the input test case
a, b, c = map(int, input().split())

# Check the condition and print the output
if a + b + c >= 22:
    print("bust")
else:
    print("win")