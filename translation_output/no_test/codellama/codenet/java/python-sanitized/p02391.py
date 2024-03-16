import sys

cmd = sys.stdin.readline()
str = cmd.split(" ")

x = int(str[0])
y = int(str[1])

if x == y:
    print("a == b")
elif x < y:
    print("a < b")
elif x > y:
    print("a > b")