# Read input split by space and map it to integers
num1, num2 = map(int, input().split())

# Check the condition and print "YES" or "NO"
if (num1 + 1) // 2 >= num2:
    print("YES")
else:
    print("NO")