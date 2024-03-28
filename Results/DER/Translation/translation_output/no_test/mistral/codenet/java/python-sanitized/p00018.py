import sys

def strkn(ans):
    ans.sort(reverse=True)
    return str(ans[0]) + " " + str(ans[1]) + " " + str(ans[2]) + " " + str(ans[3]) + " " + str(ans[4])

ans = [1, 1, 1, 1, 1]
count = 0

while sys.stdin.readline():
    num = int(sys.stdin.readline())
    ans[count] = num
    count += 1
    if count == 5:
        print(strkn(ans))
        break