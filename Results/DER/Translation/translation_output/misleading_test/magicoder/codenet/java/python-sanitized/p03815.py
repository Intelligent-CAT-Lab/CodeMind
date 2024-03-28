import sys

def solve(x):
    answer = x // 11 * 2
    mod = x % 11
    step = x // 11
    if mod > 0:
        if mod <= 6 - step % 2:
            answer += 1
        else:
            answer += 2
    return answer

def main():
    x = int(sys.stdin.readline())
    print(solve(x))

if __name__ == "__main__":
    main()