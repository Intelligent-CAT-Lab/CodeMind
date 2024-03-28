import sys

def main():
    line = sys.stdin.readline().strip()
    is = [i/4 for i in range(24)]
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
    tab = [[-1, -1, 0, 1, -1, -1, -1, -1],
           [-1, -1, 3, 2, -1, -1, -1, -1], [4, 5, 8, 9, 12, 13, 16, 17],
           [7, 6, 11, 10, 15, 14, 19, 18],
           [-1, -1, 20, 21, -1, -1, -1, -1],
           [-1, -1, 23, 22, -1, -1, -1, -1]]
    for j in range(len(tab)):
        for i in range(len(tab[j])):
            print(tab[j][i] == -1 and '.' or 'rgybwo'[is[tab[j][i]]], end='')
        print()

def up(is):
    is[0], is[1], is[2], is[3] = is[1], is[0], is[3], is[2]
    is[4], is[16], is[12], is[8] = is[16], is[4], is[8], is[12]
    is[5], is[17], is[13], is[9] = is[17], is[5], is[9], is[13]

def front(is):
    is[8], is[9], is[10], is[11] = is[9], is[8], is[11], is[10]
    is[2], is[15], is[20], is[5] = is[15], is[2], is[5], is[20]
    is[3], is[12], is[21], is[6] = is[12], is[3], is[6], is[21]

def right(is):
    is[12], is[13], is[14], is[15] = is[13], is[12], is[15], is[14]
    is[2], is[16], is[22], is[10] = is[16], is[2], is[10], is[22]
    is[1], is[19], is[21], is[9] = is[19], is[1], is[9], is[21]

def down(is):
    is[20], is[21], is[22], is[23] = is[21], is[20], is[23], is[22]
    is[11], is[15], is[19], is[7] = is[15], is[11], is[7], is[19]
    is[10], is[14], is[18], is[6] = is[14], is[10], is[6], is[18]

def back(is):
    is[16], is[17], is[18], is[19] = is[17], is[16], is[19], is[18]
    is[13], is[0],