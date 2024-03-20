import sys

def up():
    is[0], is[1], is[2], is[3] = is[2], is[3], is[1], is[0]
    is[4], is[16], is[12], is[8] = is[12], is[16], is[4], is[8]
    is[5], is[17], is[13], is[9] = is[13], is[17], is[5], is[9]

def front():
    is[8], is[9], is[10], is[11] = is[9], is[10], is[11], is[8]
    is[2], is[15], is[20], is[5] = is[15], is[20], is[2], is[5]
    is[3], is[12], is[21], is[6] = is[12], is[21], is[3], is[6]

def right():
    is[12], is[13], is[14], is[15] = is[13], is[14], is[15], is[12]
    is[2], is[16], is[22], is[10] = is[16], is[22], is[2], is[10]
    is[1], is[19], is[21], is[9] = is[19], is[21], is[1], is[9]

def down():
    is[20], is[21], is[22], is[23] = is[21], is[22], is[23], is[20]
    is[11], is[15], is[19], is[7] = is[15], is[19], is[11], is[7]
    is[10], is[14], is[18], is[6] = is[14], is[18], is[10], is[6]

def back():
    is[16], is[17], is[18], is[19] = is[17], is[18], is[19], is[16]
    is[13], is[0], is[7], is[22] = is[0], is[7], is[13], is[22]
    is[14], is[1], is[4], is[23] = is[1], is[4], is[14], is[23]

def left():
    is[4], is[5], is[6], is[7] = is[5], is[6], is[7], is[4]
    is[0], is[8], is[20], is[18] = is[8], is[20], is[0], is[18]
    is[3], is[11], is[23], is[17] = is[11], is[23], is[3], is[17]

def swap(a, b, c, d):
    t = is[d]
    is[d] = is[c]
    is[c] = is[b]
    is[b] = is[a]
    is[a] = t

def debug(*os):
    print(os, file=sys.stderr)

def print(s):
    print(s, end='')

def println(s):
    print(s)

is = [i//4 for i in range(24)]
line = input()

for c in line:
    if c == 'U':
        up()
    elif c == 'F':
        front()
    elif c == 'R':