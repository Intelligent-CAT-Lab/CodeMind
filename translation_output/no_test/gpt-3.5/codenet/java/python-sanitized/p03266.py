import sys

if __name__ == "__main__":
    input_lines = sys.stdin.read().splitlines()
    N, K = map(int, input_lines[0].split())

    if K % 2 == 0:
        c1 = N // K
        c2 = N // (K // 2) - c1
        print(c1 * c1 * c1 + c2 * c2 * c2)
    else:
        c = N // K
        print(c * c * c)