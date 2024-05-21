import sys

CMD = sys.stdin.readline()
str = CMD.split(" ") 

x = int(str[0])
y = int(str[1])

if x == y:
    print("a == b")
elif x < y:
    print("a < b")
elif x > y:
    print("a > b")