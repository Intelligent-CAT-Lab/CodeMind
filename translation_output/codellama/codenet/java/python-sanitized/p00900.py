import sys
import math

def solve(h, w, map, bomb, ps):
    # Initialize variables
    INF = 1 << 28
    EPS = 1e-10
    size = len(ps)
    pow10 = [100] * size
    memo = {}

    # Calculate the initial sum
    S = 0
    for i in range(size):
        S += pow10[i] * map[ps[i].y][ps[i].x]

    # Recursive function to solve the problem
    def solve_rec(S, cnt):
        # Base case: if the sum is equal to the number of players, return 0
        if S % 100 == size:
            if S / 100 == 0:
                return 0
            else:
                return INF

        # If the current player is the last player, check if the sum is valid
        if cnt == 9:
            if S / pow10[p] % 10 == 0:
                return solve_rec(S+1, 0)
            else:
                return INF

        # Initialize the minimum number of moves to INF
        min = INF

        # Try all possible moves for the current player
        for i in range(size):
            # Calculate the next position
            x = ps[p].x + dx[cnt]
            y = ps[p].y + dy[cnt]

            # Check if the position is valid
            if out(x, y) or bomb[y][x] or map[y][x] < 0:
                continue

            # Mark the position as bomb
            bomb[y][x] = True

            # Calculate the next sum
            next = S
            for i in range(size):
                for j in range(9):
                    tx = x + dx[j]
                    ty = y + dy[j]
                    if out(tx, ty):
                        continue
                    tar = (tx, ty)
                    if not ps[i].isEquals(tar):
                        continue
                    if next / pow10[i] % 10 > 0:
                        next -= pow10[i]
                    else:
                        break

            # If the next sum is valid,