import sys

def p01610():
    line = input()
    is = [i // 4 for i in range(24)]
    for c in line:
        if c == 'U':
            up(is)
        elif c == 'F':
            front(is)
        elif c == 'R':
            right(is)
        elif c == 'D':
            down(is)
        elif c == 'B':
            back(is)
        elif c == 'L':
            left(is)
    print("".join(["rgybwo"[i] for i in is if i != -1]))

def up(is):
    is[0], is[1], is[2], is[3] = is[1], is[0], is[3], is[2]
    is[4], is[16], is[12], is[8] = is[12], is[16], is[8], is[4]
    is[5], is[17], is[13], is[9] = is[17], is[5], is[9], is[13]

def front(is):
    is[8], is[9], is[10], is[11] = is[11], is[9], is[10], is[8]
    is[2], is[15], is[20], is[5] = is[5], is[20], is[15], is[2]
    is[3], is[12], is[21], is[6] = is[6], is[12], is[21], is[3]

def right(is):
    is[12], is[13], is[14], is[15] = is[13], is[14], is[15], is[12]
    is[2], is[16], is[22], is[10] = is[10], is[16], is[22], is[2]
    is[1], is[19], is[21], is[9] = is[9], is[1], is[21], is[19]

def down(is):
    is[20], is[21], is[22], is[23] = is[21], is[22], is[23], is[20]
    is[11], is[15], is[19], is[7] = is[19], is[15], is[7], is[11]
    is[10], is[14], is[18], is[6] = is[6], is[14], is[18], is[10]

def back(is):
    is[16], is[17], is[18], is[19] = is[19], is[17], is[16], is[18]
    is[13], is[0], is[7], is[22] = is[22], is