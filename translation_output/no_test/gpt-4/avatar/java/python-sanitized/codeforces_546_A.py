# input() reads a string with a line of input, stripping the ' ' (newline) at the end.
# This is all you need for most Codeforces problems.
o = int(input())
n = int(input())
g = int(input())

x = 0
borrow = 0

for i in range(1, g + 1):
    x += i * o

borrow = x - n

if borrow <= 0:
    print(0)
else:
    print(borrow)