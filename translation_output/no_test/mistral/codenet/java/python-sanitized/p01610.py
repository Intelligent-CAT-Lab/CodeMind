import sys

def run():
    line = input()
    solve(line)

def solve(line):
    is = [i//4 for i in range(24)]
    for c in line:
        if c == 'U':
            up()
        elif c == 'F':
            front()
        elif c == 'R':
            right()
        elif c == 'D':
            down()
        elif c == 'B':
            back()
        elif c == 'L':
            left()

    print("".join(["." if i == -1 else "rgybwo".charAt(is[i]) for i in range(24)]) + "\n")

def up():
    is[0], is[1], is[2], is[3] = is[3], is[2], is[1], is[0]
    is[4], is[15], is[11], is[7] = is[7], is[11], is[15], is[4]
    is[5], is[16], is[13], is[9] = is[9], is[13], is[16], is[5]

def front():
    is[8], is[9], is[10], is[11] = is[11], is[9], is[8], is[10]
    is[2], is[14], is[20], is[5] = is[5], is[20], is[14], is[2]
    is[3], is[12], is[21], is[6] = is[6], is[12], is[21], is[3]

def right():
    is[12], is[13], is[14], is[15] = is[15], is[14], is[13], is[12]
    is[2], is[16], is[22], is[10] = is[10], is[16], is[22], is[2]
    is[1], is[19], is[21], is[9] = is[9], is[19], is[21], is[1]

def down():
    is[20], is[21], is[22], is[23] = is[23], is[22], is[21], is[20]
    is[11], is[15], is[19], is[7] = is[7], is[19], is[11], is[15]
    is[10], is[14], is[18], is[6] = is[6], is[14], is[18], is[10]

def back():
    is[16], is[17], is[18], is[19] = is[19], is[17], is[16], is[18]
    is[13], is[0], is[7], is[22] = is[22], is[13], is[0], is[7]
    is[14], is[1], is[4], is[23] = is[23], is[14], is[1], is[4