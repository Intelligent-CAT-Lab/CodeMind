import sys

def solve(input):
    result = 0
    p = 0
    g = 1

    for i in range(1, len(input)):
        if input[i] == 'g':
            if p + 1 <= g:
                result += 1
                p += 1
            else:
                g += 1
        else:
            if p + 1 <= g:
                p += 1
            else:
                g += 1
                result -= 1

    return result

if __name__ == "__main__":
    input = sys.stdin.readline().strip()
    print(solve(input))