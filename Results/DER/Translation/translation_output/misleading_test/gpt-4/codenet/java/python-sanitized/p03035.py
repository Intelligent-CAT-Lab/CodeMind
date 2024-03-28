# Read input from the user
a, b = map(int, input().split())

# Decision logic based on age 'a' and bus fare 'b'
if a <= 5:
    print(0)
elif a <= 12:
    print(b // 2)
else:
    print(b)