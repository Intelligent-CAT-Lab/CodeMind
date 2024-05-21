import sys

def strkn(ans):
    ans.sort(reverse=True)
    return''.join(map(str, ans))

if __name__ == '__main__':
    ans = []
    for line in sys.stdin:
        ans.append(int(line))
        if len(ans) == 5:
            print(strkn(ans))
            break