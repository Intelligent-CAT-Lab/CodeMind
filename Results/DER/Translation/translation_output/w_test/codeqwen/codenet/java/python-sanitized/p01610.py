import sys

def run():
    line = sys.stdin.readline().strip()
    solve(line)

def solve(line):
    is_ = [i // 4 for i in range(24)]
    for c in line:
        if c == 'U':
            up(is_)
        elif c == 'F':
            front(is_)
        elif c == 'R':
            right(is_)
        elif c == 'D':
            down(is_)
        elif c == 'B':
            back(is_)
        elif c == 'L':
            left(is_)
    tab = [[-1, -1, 0, 1, -1, -1, -1, -1],
           [-1, -1, 3, 2, -1, -1, -1, -1], [4, 5, 8, 9, 12, 13, 16, 17],
           [7, 6, 11, 10, 15, 14, 19, 18],
           [-1, -1, 20, 21, -1, -1, -1, -1],
           [-1, -1, 23, 22, -1, -1, -1, -1]]
    for j in range(len(tab)):
        for i in range(len(tab[j])):
            if tab[j][i] == -1:
                print(".", end="")
            else:
                print("rgybwo"[is_[tab[j][i]]], end="")
        print()

def up(is_):
    is_[0], is_[1], is_[2], is_[3] = is_[1], is_[2], is_[3], is_[0]
    is_[4], is_[16], is_[12], is_[8] = is_[16], is_[12], is_[8], is_[4]
    is_[5], is_[17], is_[13],