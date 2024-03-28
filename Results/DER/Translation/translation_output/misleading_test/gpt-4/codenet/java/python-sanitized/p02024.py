# Read inputs from the console
h, w, s, t = map(int, input().split())

# Check conditions and print the result
if h * w % 2 == 1 and (s * w + t) % 2 == 1:
    print("No")
else:
    print("Yes")

# Sample Test Case
# input_str = '4 5 2 3'
# h, w, s, t = map(int, input_str.split())
# if h * w % 2 == 1 and (s * w + t) % 2 == 1:
#     print("No")
# else:
#     print("Yes")