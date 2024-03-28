def inp():
    return input()

inStr = inp()
in = inStr.split(" ")

a = int(in[0])
b = int(in[1])
c = int(in[2])

if a < b < c:
    print("Yes")
else:
    print("No")