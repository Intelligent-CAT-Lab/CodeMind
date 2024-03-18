import sys
import time

start_time = time.time()

def solve(A, B):
    i = B + 1
    while time.time() - start_time <= 3.5:
        if (i & 0xFF) == 0:
            break
        ca = i // A + i % A
        remb = i % B
        cb = i // B + remb // A + remb % A
        if ca < cb:
            return i
        i += 1
    return -1

if __name__ == "__main__":
    A, B = map(int, input().split())
    print(solve(A, B))