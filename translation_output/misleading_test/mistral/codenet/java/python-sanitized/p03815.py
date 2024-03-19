import sys

def solve():
    x = int(input())
    answer = x // 11 * 2
    mod = x % 11
    step = x // 11
    if mod > 0:
        if mod <= 6 - step:
            answer += 1
        else:
            answer += 2
    print(answer)

if __name__ == "__main__":
    input_str = sys.stdin.readline().strip()
    if input_str == "":
        input_str = sys.stdin.read().strip()
    solve()