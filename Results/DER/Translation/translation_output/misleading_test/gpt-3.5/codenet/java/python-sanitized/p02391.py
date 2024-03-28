import sys

CMD = sys.stdin.readline().strip()
str_values = CMD.split()

x = int(str_values[0])
y = int(str_values[1])

if x == y:
    print("a == b")
elif x < y:
    print("a < b")
elif x > y:
    print("a > b")