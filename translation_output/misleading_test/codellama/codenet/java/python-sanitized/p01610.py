import math
import sys

EPS = 1e-12

def solve():
    is = [i // 4 for i in range(24)]
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
    tab = [
        [-1, -1, 0, 1, -1, -1, -1, -1],
        [-1, -1, 3, 2, -1, -1, -1, -1],
        [4, 5, 8, 9, 12, 13, 16, 17],
        [7, 6, 11, 10, 15, 14, 19, 18],
        [-1, -1, 20, 21, -1, -1, -1, -1],
        [-1, -1, 23, 22, -1, -1, -1, -1],
    ]
    for j in range(len(tab)):
        for i in range(len(tab[j])):
            print(tab[j][i] == -1 and "." or "rgybwo"[is[tab[j][i]]], end="")
        print()

def up():
    swap(0, 1, 2, 3)
    swap(4, 16, 12, 8)
    swap(5, 17, 13, 9)

def front():
    swap(8, 9, 10, 11)
    swap(2, 15, 20, 5)
    swap(3, 12, 21, 6)

def right():
    swap(12, 13, 14, 15)
    swap(2, 16, 22, 10)
    swap(1, 19, 21, 9)

def down():
    swap(20, 21, 22, 23)
    swap(11, 15, 19, 7)
    swap(10, 14, 18, 6)

def back():
    swap(16, 17, 18, 19)
    swap(13, 0, 7, 22)
    swap(14, 1, 4, 23)

def left():
    swap(4, 5, 6, 7)
    swap(0, 8, 20, 18)
    swap(3, 1