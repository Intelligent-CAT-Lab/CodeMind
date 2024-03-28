import sys

def strkn(ans):
    ans.sort(reverse=True)
    result = str(ans[0]) + " " + str(ans[1]) + " " + str(ans[2]) + " " + str(ans[3]) + " " + str(ans[4])
    return result

ans = []
for line in sys.stdin:
    ans.append(int(line))
    if len(ans) == 5:
        print(strkn(ans))
        break