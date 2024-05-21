import sys

def up():
    global cube
    cube = [cube[1], cube[5], cube[9], cube[13], cube[0], cube[4], cube[8], cube[12], cube[2], cube[6], cube[10], cube[14], cube[3], cube[7], cube[11], cube[15]]

def front():
    global cube
    cube = [cube[11], cube[10], cube[9], cube[8], cube[15], cube[14], cube[13], cube[12], cube[3], cube[2], cube[1], cube[0], cube[7], cube[6], cube[5], cube[4]]

def right():
    global cube
    cube = [cube[7], cube[4], cube[1], cube[12], cube[11], cube[8], cube[5], cube[16], cube[15], cube[12], cube[9], cube[0], cube[3], cube[0], cube[13], cube[10]]

def down():
    global cube
    cube = [cube[3], cube[7], cube[11], cube[15], cube[0], cube[4], cube[8], cube[12], cube[1], cube[5], cube[9], cube[13], cube[2], cube[6], cube[10], cube[14]]

def back():
    global cube
    cube = [cube[13], cube[14], cube[15], cube[12], cube[1], cube[0], cube[3], cube[2], cube[5], cube[4], cube[7], cube[6], cube[9], cube[8], cube[11], cube[10]]

def left():
    global cube
    cube = [cube[5], cube[6], cube[7], cube[4], cube[13], cube[14], cube[15], cube[12], cube[1], cube[0], cube[3], cube[2], cube[11], cube[10], cube[9], cube[8]]

cube = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]

for c in sys.stdin.read():
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

for i in range(0, 24, 4):
    for j in range(i, i+4):
        if cube[j] == 0:
            sys.stdout.write('r')
        elif cube[j] == 1:
            sys.stdout.write('g')
        elif cube[j] == 2:
            sys.stdout.write('b')
        elif cube[j] == 3:
            sys.stdout.write('y')
        elif cube[j] == 4:
            sys.stdout.write('o')
        elif cube[j] == 5:
            sys.stdout.write('w')
        sys.stdout.write('.')
    sys.stdout.write('\n')