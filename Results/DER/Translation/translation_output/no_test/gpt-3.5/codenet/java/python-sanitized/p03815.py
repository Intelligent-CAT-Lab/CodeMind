import sys
import io
import os


def solve():
    x = nl()
    answer = x // 11 * 2
    mod = x % 11
    step = x // 11
    if mod > 0:
        if mod <= 6 - step % 2:
            answer += 1
        else:
            answer += 2
    print(answer)

def main():
    solve()

def nl():
    return int(input())

if __name__ == '__main__':
    main()