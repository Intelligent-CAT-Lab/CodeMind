import sys

import numpy as np

sys.setrecursionlimit(10000)
INF = float('inf')

W, B = list(map(int, input().split()))

# ↓こんな感じのやつつくって必要な分だけ消せばいい
# #################
# #.#.#.#.#.#.#.#.#
# #################
# #.#.#.#.#.#.#.#.#
# #################
# #.#.#.#.#.#.#.#.#
# #################
# .................
# .#.#.#.#.#.#.#.#.
# .................
# .#.#.#.#.#.#.#.#.
# .................
# .#.#.#.#.#.#.#.#.
# .................

np.set_printoptions(threshold=np.inf)

# 500個ずつ作るよ
HEIGHT = 82
WIDTH = 51
table = np.empty((HEIGHT, WIDTH), dtype=str)
table[:HEIGHT//2:2, :] = '#'
table[1:HEIGHT//2:2, ::2] = '#'
table[1:HEIGHT//2:2, 1::2] = '.'
table[HEIGHT//2::2, :] = '.'
table[HEIGHT//2 + 1::2, ::2] = '.'
table[HEIGHT//2 + 1::2, 1::2] = '#'

whites = 501
blacks = 501
for i in range(HEIGHT // 2):
    for j in range(WIDTH):
        if whites <= W:
            break
        if table[i][j] == '.':
            table[i][j] = '#'
            whites -= 1
for i in range(HEIGHT // 2, HEIGHT):
    for j in range(WIDTH):
        if blacks <= B:
            break
        if table[i][j] == '#':
            table[i][j] = '.'
            blacks -= 1

print(HEIGHT, WIDTH)
for t in table:
    print(''.join(t))

